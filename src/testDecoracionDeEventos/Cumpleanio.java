package testDecoracionDeEventos;

import java.time.Duration;
import java.time.LocalDateTime;

import clasesProductivasDecoracionDeEventos.Decoracion;
import clasesProductivasDecoracionDeEventos.Evento;
import clasesProductivasDecoracionDeEventos.Tamanio;

public class Cumpleanio extends Evento {

	public Cumpleanio(Tamanio lugar, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraFin,
			Integer cantDeInvitados) {
		super(lugar, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularPrecioBase() {
		Duration duracion = Duration.between(getFechaYHoraInicio(), getFechaYHoraFin());
		Double cantHoras = (double) duracion.toHours();

		Decoracion deco1 = new Premium(7000.0);
		Double precioDeco = deco1.CalcularPrecio(getTamanio());

		Double precioBaseConAumento = this.getPrecioBase() * 1.20;
		Double precio = (precioBaseConAumento + precioDeco) * cantHoras;
		//((15000 * 1.20=) 18000 + 14000) * 2
		return precio;
	}

}

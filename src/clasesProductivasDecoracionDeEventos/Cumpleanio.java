package clasesProductivasDecoracionDeEventos;

import java.time.Duration;
import java.time.LocalDateTime;

public class Cumpleanio extends Evento {

	public Cumpleanio(Tamanio lugar, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraFin,
			Integer cantDeInvitados, Decoracion packDeco) {
		super(lugar, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados, packDeco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularPrecioBase() {
		Duration duracion = Duration.between(getFechaYHoraInicio(), getFechaYHoraFin());
		Double cantHoras = (double) duracion.toHours();

		
		Double precioDeco = this.getPackDeco().CalcularPrecio(getTamanio());

		Double precioBaseConAumento = this.getPrecioBase() * 1.20;
		Double precio = (precioBaseConAumento + precioDeco) * cantHoras;
		//((15000 * 1.20=) 18000 + 14000) * 2
		return precio;
	}
}

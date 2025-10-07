package clasesProductivasDecoracionDeEventos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Comunion extends Evento {

	public Comunion(Tamanio lugar, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraFin, int cantDeInvitados) {
		super(lugar, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados);
		// TODO Auto-generated constructor stub
	}
    
	
	@Override
	public Double calcularPrecioBase() {
		Duration duracion = Duration.between(getFechaYHoraInicio(), getFechaYHoraFin());
		Double cantHoras = (double) duracion.toHours();
		Decoracion deco2 =new Medio(14000.);
		double precioDeco = deco2.CalcularPrecio(getTamanio());
				
	     Double precio = (this.getPrecioBase() + precioDeco  ) * cantHoras;
		return precio;
	}


	
}

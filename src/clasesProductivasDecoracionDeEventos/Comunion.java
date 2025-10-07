package clasesProductivasDecoracionDeEventos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Comunion extends Evento {

	public Comunion(Tamanio lugar, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraFin, int cantDeInvitados, Decoracion packDeco) {
		super(lugar, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados, packDeco);
		// TODO Auto-generated constructor stub
	}
    
	
	@Override
	public Double calcularPrecioBase() {
		Duration duracion = Duration.between(getFechaYHoraInicio(), getFechaYHoraFin());
		Double cantHoras = (double) duracion.toHours();
		
		
		double precioDeco = this.getPackDeco().CalcularPrecio(getTamanio());
		
	     Double precio =  (this.getPrecioBase() + precioDeco  ) * cantHoras;
	     Double precioConDescuento = precio * 0.95;
		return precioConDescuento;
	}


	
}

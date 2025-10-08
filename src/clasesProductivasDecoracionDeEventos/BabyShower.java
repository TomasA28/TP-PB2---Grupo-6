package clasesProductivasDecoracionDeEventos;

import java.time.Duration;
import java.time.LocalDateTime;

public class BabyShower extends Evento {

	public BabyShower(Tamanio lugar, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraFin, int cantDeInvitados,
			Decoracion packDeco) {
		super(lugar, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados, packDeco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularPrecioBase() {
		Duration duracion = Duration.between(getFechaYHoraInicio(), getFechaYHoraFin());
		Double cantHoras = (double) duracion.toHours();
		Double PrecioDeco = getPackDeco().CalcularPrecio(this.getTamanio());
	
		
		Double precio = ((this.getPrecioBase() + PrecioDeco ) * cantHoras ) + 20000.0 ;
		return precio;
	}
}

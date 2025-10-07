package clasesProductivasDecoracionDeEventos;

import java.time.Duration;
import java.time.LocalDateTime;
	//ATRIBUTOS
	public class Casamiento extends Evento {

		public Casamiento(Tamanio tamanio, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraFin,
		int cantDeInvitados, Decoracion packDeco) {
		super(tamanio, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados, packDeco);
		}
	
	//GET Y SET
	
	//METODOS
	@Override
	public Double calcularPrecioBase() {
		Double porcentajeAgregado =  this.getPrecioBase() * 1.5;
		
		Duration duracionDeEvento = Duration.between(getFechaYHoraInicio(), getFechaYHoraFin());
		Double cantDeHoras = (double) duracionDeEvento.toHours();
		Double precioConHoras = porcentajeAgregado * cantDeHoras;
		
		Double precioCalculado = precioConHoras + this.getPackDeco().CalcularPrecio(getTamanio());
		return precioCalculado;
	}
}

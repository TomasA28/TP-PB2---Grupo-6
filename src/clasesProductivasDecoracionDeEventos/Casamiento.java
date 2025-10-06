package clasesProductivasDecoracionDeEventos;

import java.time.LocalDateTime;
	//ATRIBUTOS
	public class Casamiento extends Evento {

		public Casamiento(Tamanio tamanio, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraFin,
		int cantDeInvitados) {
		super(tamanio, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados);
			// TODO Auto-generated constructor stub
		}
	
	//GET Y SET
	
	//METODOS
	@Override
	public Double calcularPrecioBase() {
		// TODO Auto-generated method stub
		return super.calcularPrecioBase();
	}
}

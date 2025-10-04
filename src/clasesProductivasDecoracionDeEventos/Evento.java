package clasesProductivasDecoracionDeEventos;

import java.time.LocalDateTime;

public abstract class Evento {
	//ATRIBUTOS
	private Lugar lugar;
	private LocalDateTime fechaYHoraInicio;
	private LocalDateTime fechaYHoraFin;
	private Integer cantDeInvitados;

	//CONSTRUCTOR
	public Evento(Lugar lugar, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraFin, int cantDeInvitados) {
		this.lugar = lugar;
		this.fechaYHoraInicio = fechaYHoraInicio;
		this.fechaYHoraFin = fechaYHoraFin;
		this.cantDeInvitados = cantDeInvitados;
	}

	public Double calcularPrecioBase() {
		// TODO Auto-generated method stub
		return null;
	}

}

package clasesProductivasDecoracionDeEventos;

import java.time.LocalDateTime;
import java.util.HashSet;

public abstract class Evento {
	// ATRIBUTOS
	private Tamanio tamanio;
	private LocalDateTime fechaYHoraInicio;
	private LocalDateTime fechaYHoraFin;
	private Integer cantDeInvitados;
	final private Integer precioBase = 15000;
	HashSet<ServiciosPrestados> serviciosPrestados = new HashSet<>();

	// CONSTRUCTOR
	public Evento(Tamanio lugar, Decoracion decoracionElegida, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraFin, int cantDeInvitados) {
		this.tamanio = lugar;
		this.fechaYHoraInicio = fechaYHoraInicio;
		this.fechaYHoraFin = fechaYHoraFin;
		this.cantDeInvitados = cantDeInvitados;
	}
	//GET Y SET
	public Tamanio getTamanio() {
		return tamanio;
	}
	
	public LocalDateTime getFechaYHoraInicio() {
		return fechaYHoraInicio;
	}
	
	public LocalDateTime getFechaYHoraFin() {
		return fechaYHoraFin;
	}

	public Integer getCantDeInvitados() {
		return cantDeInvitados;
	}

	public Integer getPrecioBase() {
		return precioBase;
	}
	
	//METODOS
	
	public Double calcularPrecioBase() {

		return null;
	}

}

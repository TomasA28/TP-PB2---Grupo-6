package clasesProductivasDecoracionDeEventos;

import java.time.LocalDateTime;


public abstract class Evento {
	// ATRIBUTOS
	private Tamanio tamanio;
	private LocalDateTime fechaYHoraInicio;
	private LocalDateTime fechaYHoraFin;
	private Integer cantDeInvitados;
	final private Integer precioBase = 15000;
	private Decoracion packDeco;

	// CONSTRUCTOR
	public Evento(Tamanio lugar, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraFin, int cantDeInvitados,
			Decoracion packDeco) {
		this.tamanio = lugar;
		this.fechaYHoraInicio = fechaYHoraInicio;
		this.fechaYHoraFin = fechaYHoraFin;
		this.cantDeInvitados = cantDeInvitados;
		this.packDeco = packDeco;
	}

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

	public Decoracion getPackDeco() {
		return packDeco;
	}

	public Double calcularPrecioBase() {

		return null;
	}

}

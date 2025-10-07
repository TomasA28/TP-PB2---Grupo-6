package clasesProductivasDecoracionDeEventos;

import java.time.LocalDateTime;
import java.util.HashSet;

public class GestorDeDecoracionEventos {

	HashSet<Evento> eventos;

	public GestorDeDecoracionEventos() {
		this.eventos = new HashSet<>();
	}

	public Boolean agregarEvento(Evento evento) {

		if (horarioSuperpuesto(evento)) {
			return false;
		}

		return this.eventos.add(evento);
	}

	public Boolean cancelarEvento(Evento evento) {
		return this.eventos.remove(evento);
	}

	public Boolean horarioSuperpuesto(Evento nuevoEvento) {
		for (Evento eventoExistente : this.eventos) {
			if (seSuperpone(eventoExistente, nuevoEvento)) {
				return true;
			}

		}
		return false;

	}

	public Boolean seSuperpone(Evento eventoExistente, Evento nuevoEvento) {

		LocalDateTime inicioEventoExistente = eventoExistente.getFechaYHoraInicio();
		LocalDateTime finEventoExistente = eventoExistente.getFechaYHoraFin();
		LocalDateTime inicioNuevoEvento = nuevoEvento.getFechaYHoraInicio();
		LocalDateTime finNuevoEvento = nuevoEvento.getFechaYHoraFin();

		Boolean eventoEmpieza = inicioEventoExistente.isBefore(finNuevoEvento);
		Boolean eventoFinaliza = finEventoExistente.isAfter(inicioNuevoEvento);

		return (eventoEmpieza && eventoFinaliza);

	}

}

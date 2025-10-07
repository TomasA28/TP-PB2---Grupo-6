package clasesProductivasDecoracionDeEventos;

import java.util.HashSet;

public class GestorDeDecoracionEventos {

	HashSet<Evento> eventos;

	public GestorDeDecoracionEventos() {
		this.eventos = new HashSet<>();
	}

	
	public Boolean agregarEvento(Evento evento) {
		return this.eventos.add(evento);
	}
















}

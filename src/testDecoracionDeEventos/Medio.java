package testDecoracionDeEventos;

import clasesProductivasDecoracionDeEventos.Decoracion;
import clasesProductivasDecoracionDeEventos.Tamanio;

public class Medio extends Decoracion {

	
	
	public Medio(Double precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double CalcularPrecio(Tamanio tamanio) {
		// TODO Auto-generated method stub
		return super.CalcularPrecio(tamanio);
	}
	
	@Override
	public String Descripcion() {
		
		return "decoracion de eevento medio. incluye globos, manteles de tela, etc" ;
	}

}

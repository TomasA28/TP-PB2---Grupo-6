package clasesProductivasDecoracionDeEventos;

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
		
		return "Decoracion de Evento Medio:"
				+ " Centros de mesa elaborados"
				+ " Guirnaldas"
				+ " Telas decorativas"
				+ " Carteleria personalizada"
				+ " Iluminacion basica"
				+ " Elementos decorativos tematicos" ;
	}

	

}

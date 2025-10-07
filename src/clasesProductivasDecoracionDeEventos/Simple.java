package clasesProductivasDecoracionDeEventos;

public class Simple extends Decoracion {

	public Simple(Double precio) {
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
		
		return "Decoracion de Evento Simple:"
				+ " Globos simples"
				+ " Guirnaldas"
				+ " Manteles estandart"
				+ " Centro de mesa simple"
				+ " Elementos decorativos simple" ;
	}

}

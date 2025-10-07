package clasesProductivasDecoracionDeEventos;

public class Premium extends Decoracion {

	public Premium(Double precio) {
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
		
		return "Decoracion de Evento Premium:"
				+ " Ambientación completa personalizada según la temática"
				+ " Iluminación profesional"
				+ " Arreglos florales exclusivos"
				+ " Telas y fondos fotográficos"
				+ " Estructuras decorativas"
				+ " Iluminacion premium";
				
	}

}

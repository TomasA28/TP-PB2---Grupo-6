package clasesProductivasDecoracionDeEventos;

public abstract class Decoracion {
	
private Double precio; 

public Decoracion(Double precio) {
	this.precio = precio;
}



public Double CalcularPrecio(Tamanio tamanio) {
	 
	double precioTamanio = 0.0;
	 switch (tamanio) {
	case CHICO:
		precioTamanio = 2;
		break;
	case MEDIANO:
		precioTamanio = 5;
		break;
	case GRANDE:
		precioTamanio = 7;
		break;
	}
	
	Double resultado = this.precio * precioTamanio;
			
	return resultado;
}

public String Descripcion() {
	return "descripcion evento default";
}

}

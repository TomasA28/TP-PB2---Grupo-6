package clasesProductivasDecoracionDeEventos;

public class Catering extends ServicioAdicional {

	public Catering() {
		// TODO Auto-generated constructor stub
	}
	
@Override
	public Double calcularPrecio(Integer cantDeInvitados) {
	Double precioBase = 7000.0;
	Double precio = precioBase * cantDeInvitados;
	
	return precio;
			
	}

}

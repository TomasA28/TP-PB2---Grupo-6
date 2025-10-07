package clasesProductivasDecoracionDeEventos;

import java.util.Objects;

public class Catering implements ServicioAdicional {
	
	private Double precioBase = 7000.0;
	private String descripcion = "Servicio de Catering que cuesta $" + precioBase + " por persona";
	
	public Catering() {
		// TODO Auto-generated constructor stub
	}
	
	public Double calcularPrecio(Integer cantDeInvitados) {
	Double precio = this.precioBase * cantDeInvitados;
	
	return precio;		
	}

	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, precioBase);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catering other = (Catering) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(precioBase, other.precioBase);
	}

}

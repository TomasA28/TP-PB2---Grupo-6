package clasesProductivasDecoracionDeEventos;

import java.util.Objects;

public class AnimacionChicos implements ServicioAdicional {
	
	private Double PrecioBase = 15000.;
	private String tematicasDeAnimacion;
	
	public AnimacionChicos() {
		// TODO Auto-generated constructor stub
	}

	//MÉTODOS
	@Override
	public Double calcularPrecio(Integer cantDeInvitados) {
		Double precio;
		if (cantDeInvitados<30) {
			precio = this.PrecioBase;
		} else {
			precio = PrecioBase + 10000.;
		}
		return precio;
	}

	public String getTematicasDeAnimacion() {
		return tematicasDeAnimacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(PrecioBase, tematicasDeAnimacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnimacionChicos other = (AnimacionChicos) obj;
		return Objects.equals(PrecioBase, other.PrecioBase)
				&& Objects.equals(tematicasDeAnimacion, other.tematicasDeAnimacion);
	}
	
	
}

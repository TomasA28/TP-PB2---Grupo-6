package clasesProductivasDecoracionDeEventos;

import java.util.Objects;

public class AnimacionAdultos implements ServicioAdicional {

	private Double PrecioBase = 20000.0;
	private String tematicasDeAnimacion;

	public AnimacionAdultos() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double calcularPrecio(Integer cantDeInvitados) {

		Double precio;
		if (cantDeInvitados < 20) {
			precio = this.PrecioBase;
		} else {
			precio = PrecioBase + 20000.0;
		}
		return precio;

	}

	public Double getPrecioBase() {
		return PrecioBase;
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
		AnimacionAdultos other = (AnimacionAdultos) obj;
		return Objects.equals(PrecioBase, other.PrecioBase)
				&& Objects.equals(tematicasDeAnimacion, other.tematicasDeAnimacion);
	}
	
	


}

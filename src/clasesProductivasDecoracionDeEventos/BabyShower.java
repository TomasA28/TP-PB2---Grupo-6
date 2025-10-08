package clasesProductivasDecoracionDeEventos;

import java.time.Duration;
import java.time.LocalDateTime;

public class BabyShower extends Evento {
	
	private static final double MONTO_FIJO = 20000.0;

	public BabyShower(Tamanio lugar, LocalDateTime fechaYHoraInicio, LocalDateTime fechaYHoraFin, int cantDeInvitados,
			Decoracion packDeco) {
		super(lugar, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados, packDeco);

	}

	@Override
	public Double calcularPrecioBase() {
		Duration duracionDeEvento = Duration.between(getFechaYHoraInicio(), getFechaYHoraFin());
		Double cantDeHoras = (double) duracionDeEvento.toHours();

		Integer porcentajeAgregado = this.getPrecioBase() ;

		Double precioDeco = this.getPackDeco().CalcularPrecio(getTamanio());

		Double precioCalculado = (porcentajeAgregado + precioDeco) * cantDeHoras + MONTO_FIJO;

		return precioCalculado;

	}

}

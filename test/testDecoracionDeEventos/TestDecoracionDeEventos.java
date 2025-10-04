package testDecoracionDeEventos;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

import clasesProductivasDecoracionDeEventos.Casamiento;
import clasesProductivasDecoracionDeEventos.Evento;
import clasesProductivasDecoracionDeEventos.Lugar;

public class TestDecoracionDeEventos {
	//TESTs de Instancias de clase Evento
	
	//METODOS
//	calcularPrecioBase();
	@Test
	private void dadoQueTengoUnCasamientoCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto(){
											// lugarDeEvento; fechaYHoraInicio; fechaYHoraFin; cantDeInvitados;
		Evento casamiento = new Casamiento(Lugar.IGLESIA_CHICA, LocalDateTime.of(2025, 12, 12, 15, 00), LocalDateTime.of(2025, 12, 12, 23, 30), 25);
		
		Double precioBaseEsperado =75000.;
		Double precioBaseObtenido= casamiento.calcularPrecioBase();
		assertEquals(precioBaseEsperado, precioBaseObtenido);
	}
	@Test
	private void dadoQueTengoUnCumpleaniosCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto() {
		
	}
	@Test
	private void dadoQueTengoUnBabyShowerCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto() { 
		
	}
	@Test
	private void dadoQueTengoUnaComunionCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto() {
		
	}
	
//	calcularPrecioFinal();
	@Test
	private void DadoQueTengoUnCumpleaniosEnUnLugarMedianoConPackDecoracionBasicoYServicioDeCateringCuandoCalculoSuPrecioFinalObtengoElMontoEsperado() {
		
	}
//	calcularReembolsoDeSeguro();
	@Test
	private void dadoQueTengoUnEventoCuandoCalculoElReembolsoDelSeguroObtengoElMontoEsperado() {
		
	}
	
//	calcularDescuentoEnEfectivo(); en efectivo (10% de descuento)
	@Test
	private void dadoQueTengoUnEventoCuandoCalculoElDescuentoEnEfectivoObtengoElMontoEsperado() {
		
	}
	
//	calcularFinalConDescuentoYReembolso();
	@Test
	private void dadoQueTengoUnEventoCuandoCalculoElPrecioFinalConDescuentoEnEfectivoYReembolsoDelSeguroObtengoElMontoEsperado() {
		
	}
}

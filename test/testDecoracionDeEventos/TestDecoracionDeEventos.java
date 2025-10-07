package testDecoracionDeEventos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;
import clasesProductivasDecoracionDeEventos.Cumpleanio;
import clasesProductivasDecoracionDeEventos.Casamiento;
import clasesProductivasDecoracionDeEventos.Comunion;
import clasesProductivasDecoracionDeEventos.Cumpleanio;
import clasesProductivasDecoracionDeEventos.Decoracion;
import clasesProductivasDecoracionDeEventos.Evento;
import clasesProductivasDecoracionDeEventos.GestorDeDecoracionEventos;
import clasesProductivasDecoracionDeEventos.Medio;
import clasesProductivasDecoracionDeEventos.Premium;
import clasesProductivasDecoracionDeEventos.Simple;
import clasesProductivasDecoracionDeEventos.Tamanio;

public class TestDecoracionDeEventos {

	@Before
	public void inicializacion() {

		GestorDeDecoracionEventos gestor = new GestorDeDecoracionEventos();
	}

	// TESTs de Instancias de clase Evento
	// METODOS
	
//	calcularPrecioBase();
	@Test
	public void dadoQueTengoUnaDecoracionCuandoLePasoElTamanioPorParametroObtengoElMontoCorrecto() {

		Decoracion deco1 = new Simple(7000.);
		Decoracion deco2 = new Medio(14000.);
		Decoracion deco3 = new Premium(28000.);

		Double precioEsperado1 = 14000.;
		Double precioEsperado2 = 70000.;
		Double precioEsperado3 = 196000.;

		Double PrecioObtenido1 = deco1.CalcularPrecio(Tamanio.CHICO);
		Double PrecioObtenido2 = deco2.CalcularPrecio(Tamanio.MEDIANO);
		Double PrecioObtenido3 = deco3.CalcularPrecio(Tamanio.GRANDE);

		assertEquals(precioEsperado1, PrecioObtenido1);
		assertEquals(precioEsperado2, PrecioObtenido2);
		assertEquals(precioEsperado3, PrecioObtenido3);
	}

	@Test
	public void dadoQueTengoUnCasamientoCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto() {
		// lugarDeEvento; fechaYHoraInicio; fechaYHoraFin; cantDeInvitados;
	}

	@Test
	public void dadoQueTengoUnCumpleaniosCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto() {
		Tamanio lugar = Tamanio.CHICO;
		LocalDateTime fechaYHoraInicio = LocalDateTime.of(2025, 10, 01, 18, 00);
		LocalDateTime fechaYHoraFin = LocalDateTime.of(2025, 10, 01, 20, 30);

		Integer cantDeInvitados = 60;

		Evento cumpleanio = new Cumpleanio(lugar, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados);

		Double precioBaseEsperado = 64000.0;
		Double precioBaseObtenido = cumpleanio.calcularPrecioBase();
		assertEquals(precioBaseEsperado, precioBaseObtenido);

	}

	@Test
	public void dadoQueTengoUnBabyShowerCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto() {

	}

	@Test
	public void dadoQueTengoUnaComunionCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto() {
		Evento comunion = new Comunion(Tamanio.GRANDE, LocalDateTime.of(2025, 9, 3, 19, 0),
				LocalDateTime.of(2025, 9, 3, 22, 30), 120);

		Double precioBaseEsperado = 339000.;
		Double precioBaseObtenido = comunion.calcularPrecioBase();
		assertEquals(precioBaseEsperado, precioBaseObtenido);
	}

//  agregarEvento();
	@Test
	public void dadoQueExisteUnGestorDeDecoracionEventosAlAgregarUnEventoDelTipoCumpleañosExitosamenteElMetodoDevuelveTrue() {

		GestorDeDecoracionEventos gestor = new GestorDeDecoracionEventos();

		Tamanio lugar = Tamanio.CHICO;
		LocalDateTime fechaYHoraInicio = LocalDateTime.of(2025, 10, 01, 18, 00);
		LocalDateTime fechaYHoraFin = LocalDateTime.of(2025, 10, 01, 20, 30);
		Integer cantDeInvitados = 60;

		Evento evento = new Cumpleanio(lugar, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados);

		Boolean seAgrego = gestor.agregarEvento(evento);
		assertTrue(seAgrego);

	}

//	calcularPrecioFinal();
	@Test
	public void DadoQueTengoUnCumpleaniosEnUnLugarMedianoConPackDecoracionBasicoYServicioDeCateringCuandoCalculoSuPrecioFinalObtengoElMontoEsperado() {

	}

//	calcularReembolsoDeSeguro();
	@Test
	public void dadoQueTengoUnEventoCuandoCalculoElReembolsoDelSeguroObtengoElMontoEsperado() {
        
	}

//	calcularDescuentoEnEfectivo(); en efectivo (10% de descuento)
	@Test
	public void dadoQueTengoUnEventoCuandoCalculoElDescuentoEnEfectivoObtengoElMontoEsperado() {
    
	}

//	calcularFinalConDescuentoYReembolso();
	@Test
	public void dadoQueTengoUnEventoCuandoCalculoElPrecioFinalConDescuentoEnEfectivoYReembolsoDelSeguroObtengoElMontoEsperado() {

	}
}

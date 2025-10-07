package testDecoracionDeEventos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;
import clasesProductivasDecoracionDeEventos.Cumpleanio;
import clasesProductivasDecoracionDeEventos.AnimacionAdultos;
import clasesProductivasDecoracionDeEventos.AnimacionChicos;
import clasesProductivasDecoracionDeEventos.Casamiento;
import clasesProductivasDecoracionDeEventos.Catering;
import clasesProductivasDecoracionDeEventos.Comunion;
import clasesProductivasDecoracionDeEventos.Decoracion;
import clasesProductivasDecoracionDeEventos.Evento;
import clasesProductivasDecoracionDeEventos.GestorDeDecoracionEventos;
import clasesProductivasDecoracionDeEventos.Medio;
import clasesProductivasDecoracionDeEventos.Premium;
import clasesProductivasDecoracionDeEventos.ServicioAdicional;
import clasesProductivasDecoracionDeEventos.Simple;
import clasesProductivasDecoracionDeEventos.Tamanio;

public class TestDecoracionDeEventos {

	@Before
	public void inicializacion() {

		GestorDeDecoracionEventos gestor = new GestorDeDecoracionEventos();
		Decoracion packDecoPremium = new Premium(28000.);
	}

	//	Testeo de Precios de Decoracion
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

	// TESTs de Precio Base de Instancias de Evento

	@Test
	public void dadoQueTengoUnCasamientoCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto() {
		Tamanio tamanioDelLugar = Tamanio.MEDIANO;
		Decoracion decoracion = new Simple(7000.);
		Evento casamiento = new Casamiento(tamanioDelLugar, LocalDateTime.of(2026, 8, 10, 8, 30),
				LocalDateTime.of(2026, 8, 10, 15, 45), 23, decoracion);
		
		Double precioBaseEsperado = 192500.;
		Double precioBaseObtenido = casamiento.calcularPrecioBase();
		assertEquals(precioBaseEsperado, precioBaseObtenido);
		
	}

	@Test
	public void dadoQueTengoUnCumpleaniosCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto() {
		Tamanio lugar = Tamanio.CHICO;
		LocalDateTime fechaYHoraInicio = LocalDateTime.of(2025, 10, 01, 18, 00);
		LocalDateTime fechaYHoraFin = LocalDateTime.of(2025, 10, 01, 20, 30);
		Decoracion packDeco = new Premium(28000.);
		Integer cantDeInvitados = 60;

		Evento cumpleanio = new Cumpleanio(lugar, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados, packDeco);

		Double precioBaseEsperado =148000.;
		Double precioBaseObtenido = cumpleanio.calcularPrecioBase();
		assertEquals(precioBaseEsperado, precioBaseObtenido);

	}

	@Test
	public void dadoQueTengoUnBabyShowerCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto() {

	}

	@Test
	public void dadoQueTengoUnaComunionCuandoCalculoSuPrecioBaseObtengoElMontoCorrecto() {
		Decoracion packDeco = new Medio(14000.);
		Evento comunion = new Comunion(Tamanio.GRANDE, LocalDateTime.of(2025, 9, 3, 19, 0),
				LocalDateTime.of(2025, 9, 3, 22, 30), 120, packDeco);

		Double precioBaseEsperado = 322050.;
		Double precioBaseObtenido = comunion.calcularPrecioBase();
		assertEquals(precioBaseEsperado, precioBaseObtenido);
	}
	
	// Agregar Servicios Adicionales
	@Test
	public void dadoQueExisteUnEventoCuandoQuieroAgregarServiciosAdicionalesEstosSeAgreganAdecuadamente() {
		Decoracion packDecoPremium = new Premium(28000.);
		Evento comunion = new Comunion(Tamanio.GRANDE, LocalDateTime.of(2025, 9, 3, 19, 0),
				LocalDateTime.of(2025, 9, 3, 22, 30), 120, packDecoPremium);
		
		ServicioAdicional catering = new  Catering();
		ServicioAdicional animacionChicos = new  AnimacionChicos();
		ServicioAdicional animacionAdultos = new  AnimacionAdultos();
		
		comunion.agregarServicioAlEvento(catering);
		comunion.agregarServicioAlEvento(animacionChicos);
		comunion.agregarServicioAlEvento(animacionAdultos);
		
		Boolean contieneCatering = comunion.getServiciosAdicional().contains(catering);
		Boolean contieneAnimacionChicos = comunion.getServiciosAdicional().contains(animacionChicos);
		Boolean contieneAnimacionAdultos = comunion.getServiciosAdicional().contains(animacionAdultos);
		
		assertTrue(contieneCatering);
		assertTrue(contieneAnimacionChicos);
		assertTrue(contieneAnimacionAdultos);
	}
	@Test
	public void dadoQueExisteUnEventoCuandoQuieroAgregarUnServicioAdicionalDosVecesElResultadoEsFalse() {
		//RECORDATORIO: EXCEPTION PORQUE NO SE HIZO OVERRIDE EN HASHCODE Y EQUALS
		Decoracion packDecoPremium = new Premium(28000.);
		Evento comunion = new Comunion(Tamanio.GRANDE, LocalDateTime.of(2025, 9, 3, 19, 0),
				LocalDateTime.of(2025, 9, 3, 22, 30), 120, packDecoPremium);
		
		ServicioAdicional catering = new  Catering();
		ServicioAdicional catering2 = new  Catering();
		
		comunion.agregarServicioAlEvento(catering);
		comunion.agregarServicioAlEvento(catering2);
		
		 Boolean tieneDos = comunion.getServiciosAdicional().size()==2;
		
		assertFalse(tieneDos);
	}
	
	// Calcular precio de Servicios Adicionales
	
	@Test
	public void test1() {
		
	}
	
	public void test2() {
		
	}
	
	public void test3() {
		
	}
	
	//  TESTS DE GESTOR DE EVENTOS:
	@Test
	public void dadoQueExisteUnGestorDeDecoracionEventosAlAgregarUnEventoDelTipoCumpleañosExitosamenteElMetodoDevuelveTrue() {

		GestorDeDecoracionEventos gestor = new GestorDeDecoracionEventos();
		Decoracion packDeco = new Simple(700.);
		Tamanio lugar = Tamanio.CHICO;
		LocalDateTime fechaYHoraInicio = LocalDateTime.of(2025, 10, 01, 18, 00);
		LocalDateTime fechaYHoraFin = LocalDateTime.of(2025, 10, 01, 20, 30);
		Integer cantDeInvitados = 60;

		Evento evento = new Cumpleanio(lugar, fechaYHoraInicio, fechaYHoraFin, cantDeInvitados, packDeco);

		Boolean seAgrego = gestor.agregarEvento(evento);
		assertTrue(seAgrego);
	}
	
	@Test
	public void dadoQueTengoUnGestorDeEventosCuandoQuieroAgregarUnEventoSuperponiendoLosTiemposDeUnEventoYaExistenteElEventoNoSeAgrega() {
		
	}
//	calcularPrecioFinal();
	@Test
	public void DadoQueTengoUnCumpleaniosEnUnLugarMedianoConPackDecoracionBasicoYServicioDeCateringCuandoCalculoSuPrecioFinalObtengoElMontoEsperado() {

	}

//	calcularDescuentoEnEfectivo(); en efectivo (10% de descuento)
	@Test
	public void dadoQueTengoUnEventoCuandoCalculoElDescuentoEnEfectivoObtengoElMontoEsperado() {

	}
}

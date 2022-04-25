package montacarga;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnaCargaConUnPeso() {
		Double peso = 15.0;
		
		Carga c = new Carga(peso, 1);
		
		Double vo = c.getPeso();
		
		assertEquals(peso, vo, 0.01);
	}

	@Test
	public void queSePuedaCrearUnMontcargaConUnPesoMaximo() {
		Double pesoMaximo = 500.0;
		
		Montacarga mc = new Montacarga(pesoMaximo);
		
		assertNotNull(mc);
	}
	
	@Test
	public void queSePuedaAgregarUnaCargaAUnMontacarga() {
		Double pesoMaximo = 500.0, pesoParaAgregar = 15.0;
		
		Montacarga mc = new Montacarga(pesoMaximo);
		
		Carga c1 = new Carga(pesoParaAgregar, 1);
		
		Boolean agrego = mc.agregarCarga(c1);
			
		assertTrue(agrego);
		
		Integer cantCargas = 1;
	
		assertEquals(cantCargas, mc.obtenerCantidadDeCargas());
		
		Double pesoParaAgregar2 = 50.0;
		
		Carga c2 = new Carga(pesoParaAgregar2, 1);
		
		mc.agregarCarga(c2);
		
		cantCargas++;
		
		Double ve = pesoParaAgregar + pesoParaAgregar2;
		
		Double vo = mc.obtenerPesoCargado();
		
		assertEquals(ve, vo, 0.01);
	}
	
	@Test
	public void queNoSePuedaSubirMasCargaDeLoPermitido() {
		Double pesoMaximo = 500.0, pesoParaAgregar = 815.0;
		
		Montacarga mc = new Montacarga(pesoMaximo);
		
		Carga c1 = new Carga(pesoParaAgregar, 1);
		
		mc.agregarCarga(c1);
		
		Boolean sePuedeAgregar = mc.comprobarQueNoSuperePeso(pesoMaximo, pesoParaAgregar);
		
		assertFalse(sePuedeAgregar);
	}
	
	@Test
	public void queAlSubirMontacargaRegistreCargasAContadorHistorico() {
		Double pesoMaximo = 500.0, pesoParaAgregar = 115.0, contadorHistoricoCargas = 0.0;
		
		Montacarga mc = new Montacarga(pesoMaximo);
		
		Carga c1 = new Carga(pesoParaAgregar, 1);
		
		mc.agregarCarga(c1);
		
		contadorHistoricoCargas = mc.registrarCargaAContadorHistorico();
		
		Double pesoParaAgregar2 = 300.0;
		
		Carga c2 = new Carga(pesoParaAgregar2, 1);
		
		mc.agregarCarga(c2);
		
		contadorHistoricoCargas = mc.registrarCargaAContadorHistorico();
		
		Double ve = pesoParaAgregar + pesoParaAgregar2;
		
		assertEquals(ve, contadorHistoricoCargas);
	}

	@Test
	public void queVacieLasCargasCuandoSubio() {
		Double pesoMaximo = 500.0, pesoParaAgregar = 115.0;
		
		Montacarga mc = new Montacarga(pesoMaximo);
		
		Carga c1 = new Carga(pesoParaAgregar, 1);
		
		mc.agregarCarga(c1);
		
		Boolean vacio = mc.vaciarCarga(c1);
		
		assertTrue(vacio);
	}
	
}

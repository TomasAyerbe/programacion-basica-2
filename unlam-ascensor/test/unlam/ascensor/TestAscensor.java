package unlam.ascensor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAscensor {

	@Test
	public void queSePuedaCrearUnAscensor() {
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3;
		
		Ascensor a = new Ascensor(pesoMaximo, cantidadPersonasMaximas, 0, 0);
		
		assertNotNull(a);
	}
	
	@Test
	public void queSePuedaCrearUnAscensorConPisoMaximoYPisoMinimo() {
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3, pisoMaximo = 8, pisoMinimo = -2;
		
		Ascensor a = new Ascensor(pesoMaximo, cantidadPersonasMaximas, pisoMaximo, pisoMinimo);
		
		assertNotNull(a);
	}
	
	@Test
	public void queUnAscensorVayaAUnPiso() {
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3, pisoMaximo = 8, pisoMinimo = -2, pisoActual = 0, pisoDestino = 3;
		
		Ascensor a = new Ascensor(pesoMaximo, cantidadPersonasMaximas, pisoMaximo, pisoMinimo);
		
		a.irAPiso(pisoDestino);

		pisoActual = a.getPisoActual();
		
		assertEquals(pisoDestino, pisoActual);
	}

	@Test
	public void queCuandoElPisoDeseadoSeaMayorAlPisoMaximoNoSeMueva() {
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3, pisoMaximo = 8, pisoMinimo = -2, pisoActual = 3, pisoDestino = 12;
		
		Ascensor a = new Ascensor(pesoMaximo, cantidadPersonasMaximas, pisoMaximo, pisoMinimo);
		
		a.comprobarEIrAPisoMaximo(pisoDestino, pisoActual);
		
		pisoActual = a.getPisoActual();
		
		assertEquals(a.getPisoActual(), pisoActual);
	}
	
	@Test
	public void queCuandoElPisoDeseadoSeaMenorAlPisoMinimoNoSeMueva() {
		Double pesoMaximo = 200.0;
		Integer cantidadPersonasMaximas = 3, pisoMaximo = 8, pisoMinimo = -2, pisoActual = 3, pisoDestino = -5;
		
		Ascensor a = new Ascensor(pesoMaximo, cantidadPersonasMaximas, pisoMaximo, pisoMinimo);
		
		a.comprobarEIrAPisoMinimo(pisoDestino, pisoActual);
		
		pisoActual = a.getPisoActual();
		
		assertEquals(a.getPisoActual(), pisoActual);
	}

	@Test
	public void queSeAbraLaPuerta() {
		Double pesoMaximo = 200.0, pesoAscensorActual = 155.0;
		Integer cantidadPersonasMaximas = 3, pisoMaximo = 8, pisoMinimo = -2, pisoActual = 3, pisoDestino = -5, cantidadPersonasActual = 4;
		
		Ascensor a = new Ascensor(pesoMaximo, cantidadPersonasMaximas, pisoMaximo, pisoMinimo);
		
		assertTrue(a.estaAbierta(pesoAscensorActual, cantidadPersonasActual));
	}
	
	@Test
	public void queSeCierreLaPuerta() {
		Double pesoMaximo = 200.0, pesoAscensorActual = 140.0;
		Integer cantidadPersonasMaximas = 3, pisoMaximo = 8, pisoMinimo = -2, pisoActual = 3, pisoDestino = -5, cantidadPersonasActual = 2;
		
		Ascensor a = new Ascensor(pesoMaximo, cantidadPersonasMaximas, pisoMaximo, pisoMinimo);
		
		assertTrue(a.estaCerrada(pesoAscensorActual, cantidadPersonasActual));
	}
	
}

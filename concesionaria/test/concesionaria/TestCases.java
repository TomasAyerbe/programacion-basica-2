package concesionaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnaConcesionaria() {
		Concesionaria concesionaria = new Concesionaria();
		
		assertNotNull(concesionaria);
	}
	
	@Test
	public void queSePuedaAgregarUnAutoAUnaConcesionaria() {
		Concesionaria concesionaria = new Concesionaria();
		
		final String MARCA_AUTO = "Ford";
		final String PATENTE_AUTO = "AA123BB";
		
		Auto auto = new Auto(MARCA_AUTO, PATENTE_AUTO);
		
		concesionaria.agregarAuto(auto);
		
		final Integer VE = 1;
		final Integer VO = concesionaria.getAutos().size();
		
		assertEquals(VE, VO);
	}

	@Test(expected = AutoNoEncontradoException.class)
	public void queSePuedaLanzarUnaExcepcionSiNoEncuentraElAuto() throws AutoNoEncontradoException {
		Concesionaria concesionaria = new Concesionaria();
		
		final String MARCA_AUTO = "Ford";
		final String PATENTE_AUTO = "AA123BB";
		
		Auto auto = new Auto(MARCA_AUTO, PATENTE_AUTO);
		
		concesionaria.agregarAuto(auto);
		
		final String VE = auto.getPatenteAuto();
		final String VO = concesionaria.buscarPorPatente("ZZ999ZZ").getPatenteAuto();
		
		assertEquals(VE, VO);
	}
	
	@Test(expected = AutoDuplicadoException.class)
	public void queSePuedaLanzarUnaExcepcionSiElAutoEsDuplicado() throws AutoDuplicadoException {
		Concesionaria concesionaria = new Concesionaria();
		
		final String MARCA_AUTO_1 = "Ford";
		final String PATENTE_AUTO_1 = "AA123BB";
		
		Auto auto1 = new Auto(MARCA_AUTO_1, PATENTE_AUTO_1);
		
		concesionaria.agregarAuto(auto1);
		
		final String PATENTE_AUTO_2 = "AA123BB";
		
		final Boolean esDuplicado = concesionaria.buscarDuplicado(PATENTE_AUTO_2);
		
		assertFalse(esDuplicado);
	}
	
	@Test(expected = PatenteNoValidaException.class)
	public void queSePuedaLanzarUnaExcepcionSiLosPrimerosDosDigitosDeLaPatenteNoSonLetras() throws PatenteNoValidaException {
		Concesionaria concesionaria = new Concesionaria();
		
		final String PATENTE_AUTO = "11AA123BB";
		
		final Boolean esValida = concesionaria.validarPatente(PATENTE_AUTO);
		
		assertFalse(esValida);
	}
	
}

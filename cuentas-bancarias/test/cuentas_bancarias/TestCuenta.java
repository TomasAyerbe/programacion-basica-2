package cuentas_bancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuenta {

	@Test
	public void queSePuedaCrearUnaCuenta() {
		Cuenta cuenta = new Cuenta();
		
		assertNotNull(cuenta);
	}

	@Test
	public void queSePuedaConsultarElSaldoDeUnaCuenta() {
		Cuenta cuenta = new Cuenta();
		
		final Double VE = 0.0;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
}

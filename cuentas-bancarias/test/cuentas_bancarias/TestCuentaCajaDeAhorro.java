package cuentas_bancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaCajaDeAhorro {

	@Test
	public void queSePuedaCrearUnaCuentaCajaDeAhorro() {
		Double saldo = 500.0;
		
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro(saldo);
		
		assertNotNull(cuenta);
	}

	@Test
	public void queSePuedaHacerUnDepositoEnUnaCuentaCajaDeAhorro() {
		Double saldo = 500.0;
	
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro(saldo);
		
		Double importeDeposito = 100.0;
		
		cuenta.depositar(importeDeposito);
		
		Double ve = saldo + importeDeposito;
		
		saldo = cuenta.getSaldo();
		
		assertEquals(ve, saldo);
	}
	
	@Test
	public void queSePuedaHacerUnaExtraccionEnUnaCuentaCajaDeAhorro() {
		Double saldo = 500.0;
		
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro(saldo);
		
		Double importeExtraccion = 100.0;
		
		cuenta.extraer(importeExtraccion);
		
		Double ve = saldo - importeExtraccion;
		
		saldo = cuenta.getSaldo();
		
		assertEquals(ve, saldo);
	}
	
	@Test
	public void queDespuesDeLaQuintaExtraccionSeCobreAdicional() {
		Double saldo = 500.0;
	
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro(saldo);
		
		Double importeExtraccion = 100.0;
		
		cuenta.extraccionConAdicional(importeExtraccion);
		
		Double ve = saldo - importeExtraccion - 6.0;
		
		saldo = cuenta.getSaldo();
		
		assertEquals(ve, saldo);
	}
	
}

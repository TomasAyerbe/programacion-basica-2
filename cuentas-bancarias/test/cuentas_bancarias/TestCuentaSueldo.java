package cuentas_bancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaSueldo {

	@Test
	public void queSePuedaCrearUnaCuentaSueldo() {
		Double saldo = 500.0;
		
		CuentaSueldo cuenta = new CuentaSueldo(saldo);
		
		assertNotNull(cuenta);
	}
	
	@Test
	public void queSePuedaHacerUnDepositoEnUnaCuentaSueldo() {
		Double saldo = 500.0;
		
		CuentaSueldo cuenta = new CuentaSueldo(saldo);
		
		Double importeDeposito = 100.0;
		
		cuenta.depositar(importeDeposito);
		
		Double ve = saldo + importeDeposito;
		
		saldo = cuenta.getSaldo();
		
		assertEquals(ve, saldo);
	}
	
	@Test
	public void queSePuedaHacerUnaExtraccionEnUnaCuentaSueldo() {
		Double saldo = 500.0;
		
		CuentaSueldo cuenta = new CuentaSueldo(saldo);
		
		Double importeExtraccion = 100.0;
		
		cuenta.extraer(importeExtraccion);
		
		Double ve = saldo - importeExtraccion;
		
		saldo = cuenta.getSaldo();
		
		assertEquals(ve, saldo);
	}
	
}

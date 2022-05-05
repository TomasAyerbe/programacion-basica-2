package cuentas_bancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaCorriente {

	@Test
	public void queSePuedaCrearUnaCuentaCorrienteConMontoDescubierto() {
		Double saldo = 500.0;
		Double montoDescubierto = 150.0;
		
		CuentaCorriente cuenta = new CuentaCorriente(saldo, montoDescubierto);
		
		assertNotNull(cuenta);
	}
	
	@Test
	public void queSePuedaHacerUnDepositoEnUnaCuentaCorriente() {
		Double saldo = 500.0;
		Double montoDescubierto = 150.0;
		
		CuentaCorriente cuenta = new CuentaCorriente(saldo, montoDescubierto);
		
		Double importeDeposito = 100.0;
		
		cuenta.depositar(importeDeposito);
		
		Double ve = saldo + importeDeposito;
		
		saldo = cuenta.getSaldo();
		
		assertEquals(ve, saldo);
	}
	
	@Test
	public void queSePuedaHacerUnaExtraccionEnUnaCuentaCorriente() {
		Double saldo = 100.0;
		Double montoDescubierto = 150.0;
		
		CuentaCorriente cuenta = new CuentaCorriente(saldo, montoDescubierto);
		
		Double importeExtraccion = 50.0;
		
		cuenta.extraer(importeExtraccion);
		
		Double ve = saldo - importeExtraccion;
		
		saldo = cuenta.getSaldo();
		
		assertEquals(ve, saldo);
	}
	
	@Test
	public void queSePuedaHacerUnaExtraccionMayorAlSaldoEnUnaCuentaCorriente() {
		Double saldo = 100.0;
		Double montoDescubierto = 150.0;
		
		CuentaCorriente cuenta = new CuentaCorriente(saldo, montoDescubierto);
		
		Double importeExtraccion = 200.0;
		
		cuenta.extraer(importeExtraccion);
		
		Double ve = (saldo - importeExtraccion) * 1.05;
		
		saldo = cuenta.getSaldo();
		
		assertEquals(ve, saldo);
	}

}

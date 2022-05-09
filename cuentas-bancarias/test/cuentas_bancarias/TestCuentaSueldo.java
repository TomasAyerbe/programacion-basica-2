package cuentas_bancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaSueldo {

	@Test
	public void queSePuedaCrearUnaCuentaSueldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		
		assertNotNull(cuenta);
	}
	
	@Test
	public void queSePuedaHacerUnDepositoEnUnaCuentaSueldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double VE = IMPORTE_DEPOSITO;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaHacerUnaExtraccionMenorAlSaldoEnUnaCuentaSueldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double IMPORTE_EXTRACCION = 50.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
		
		final Double VE = IMPORTE_DEPOSITO - IMPORTE_EXTRACCION;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaHacerUnaExtraccionIgualAlSaldoEnUnaCuentaSueldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double IMPORTE_EXTRACCION = 100.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
		
		final Double VE = IMPORTE_DEPOSITO - IMPORTE_EXTRACCION;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queNoSePuedaHacerUnaExtraccionMayorAlSaldoEnUnaCuentaSueldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double IMPORTE_EXTRACCION = 200.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
		
		final Double VE = IMPORTE_DEPOSITO;
		
		final Double VO = cuenta.getSaldo();
		
		assertFalse(cuenta.extraer(IMPORTE_EXTRACCION));
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queNoSeCobreAdicionalLuegoDeLaQuintaExtraccionEnUnaCuentaSueldo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		
		final Double IMPORTE_DEPOSITO = 1000.0;
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double IMPORTE_EXTRACCION1 = 10.0;
		cuenta.extraer(IMPORTE_EXTRACCION1);
		
		final Double IMPORTE_EXTRACCION2 = 20.0;
		cuenta.extraer(IMPORTE_EXTRACCION2);
		
		final Double IMPORTE_EXTRACCION3 = 30.0;
		cuenta.extraer(IMPORTE_EXTRACCION3);
		
		final Double IMPORTE_EXTRACCION4 = 40.0;
		cuenta.extraer(IMPORTE_EXTRACCION4);
		
		final Double IMPORTE_EXTRACCION5 = 50.0;
		cuenta.extraer(IMPORTE_EXTRACCION5);
		
		final Double IMPORTE_EXTRACCION6 = 60.0;
		cuenta.extraer(IMPORTE_EXTRACCION6);
		
		final Double VE = IMPORTE_DEPOSITO - (IMPORTE_EXTRACCION1 + IMPORTE_EXTRACCION2 + IMPORTE_EXTRACCION3 + IMPORTE_EXTRACCION4 + IMPORTE_EXTRACCION5 + IMPORTE_EXTRACCION6);
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
}

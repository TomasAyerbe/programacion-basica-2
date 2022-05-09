package cuentas_bancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaCorriente {

	@Test
	public void queSePuedaCrearUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		assertNotNull(cuenta);
	}
	
	@Test
	public void queSePuedaHacerUnDepositoEnUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double VE = IMPORTE_DEPOSITO;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaHacerUnaExtraccionMenorAlSaldoEnUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double IMPORTE_EXTRACCION = 50.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
		
		final Double VE = IMPORTE_DEPOSITO - IMPORTE_EXTRACCION;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaHacerUnaExtraccionIgualAlSaldoEnUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double IMPORTE_EXTRACCION = 100.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
		
		final Double VE = IMPORTE_DEPOSITO - IMPORTE_EXTRACCION;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}

	@Test
	public void queSePuedaHacerUnaExtraccionMenorAlSaldoMasElDescubiertoEnUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double IMPORTE_EXTRACCION = 200.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
				
		final Double VE = 0.0;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaHacerUnaExtraccionIgualAlSaldoMasElDescubiertoEnUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double IMPORTE_EXTRACCION = 250.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
				
		final Double VE = 0.0;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queNoSePuedaHacerUnaExtraccionMayorAlSaldoMasElDescubiertoEnUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double IMPORTE_EXTRACCION = 300.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
		
		final Double VE = IMPORTE_DEPOSITO;
		
		final Double VO = cuenta.getSaldo();
		
		assertFalse(cuenta.extraer(IMPORTE_EXTRACCION));
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSeIncrementeLaDeudaCuandoSeHaceUnaExtraccion() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		final Double IMPORTE_EXTRACCION1 = 200.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION1);
		
		final Double IMPORTE_EXTRACCION2 = 50.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION2);
		
		final Double VE = 157.50;
		
		final Double VO = cuenta.getDeuda();
		
		assertEquals(VE, VO);
	}
	
}

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
		
		Registro registro = new Registro();
		
		final String MOTIVO_DEPOSITO = "Operación 00";
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		Transaccion transaccion = new Transaccion(MOTIVO_DEPOSITO, IMPORTE_DEPOSITO);
		
		registro.registrarTransaccion(transaccion);
		
		assertNotNull(registro.getRegistro());
		
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
		
		Registro registro = new Registro();
		
		final String MOTIVO_DEPOSITO = "Operación 00";
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		Transaccion transaccion = new Transaccion(MOTIVO_DEPOSITO, IMPORTE_DEPOSITO);
		
		registro.registrarTransaccion(transaccion);
		
		final String MOTIVO_EXTRACCION = "Operación 01";
		final Double IMPORTE_EXTRACCION = 50.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
		
		Transaccion transaccion1 = new Transaccion(MOTIVO_EXTRACCION, IMPORTE_EXTRACCION);
		
		registro.registrarTransaccion(transaccion1);
		
		assertNotNull(registro.getRegistro());
		
		final Double VE = IMPORTE_DEPOSITO - IMPORTE_EXTRACCION;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}

	@Test
	public void queSePuedaHacerUnaExtraccionMenorAlSaldoMasElDescubiertoEnUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente();

		Registro registro = new Registro();
		
		final String MOTIVO_DEPOSITO = "Operación 00";
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		Transaccion transaccion = new Transaccion(MOTIVO_DEPOSITO, IMPORTE_DEPOSITO);
		
		registro.registrarTransaccion(transaccion);
		
		assertNotNull(registro.getRegistro());
		
		final Double IMPORTE_EXTRACCION = 200.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
		
		assertFalse(cuenta.extraer(IMPORTE_EXTRACCION));
				
		final Double VE = 0.0;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaHacerUnaExtraccionIgualAlSaldoMasElDescubiertoEnUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente();

		Registro registro = new Registro();
		
		final String MOTIVO_DEPOSITO = "Operación 00";
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		Transaccion transaccion = new Transaccion(MOTIVO_DEPOSITO, IMPORTE_DEPOSITO);
		
		registro.registrarTransaccion(transaccion);
		
		assertNotNull(registro.getRegistro());
		
		final Double IMPORTE_EXTRACCION = 250.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
		
		assertFalse(cuenta.extraer(IMPORTE_EXTRACCION));
				
		final Double VE = 0.0;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queNoSePuedaHacerUnaExtraccionMayorAlSaldoMasElDescubiertoEnUnaCuentaCorriente() {
		CuentaCorriente cuenta = new CuentaCorriente();
		
		Registro registro = new Registro();
		
		final String MOTIVO_DEPOSITO = "Operación 00";
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		Transaccion transaccion = new Transaccion(MOTIVO_DEPOSITO, IMPORTE_DEPOSITO);
		
		registro.registrarTransaccion(transaccion);
		
		assertNotNull(registro.getRegistro());
		
		final Double IMPORTE_EXTRACCION = 300.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
		
		assertFalse(cuenta.extraer(IMPORTE_EXTRACCION));
		
		final Double VE = IMPORTE_DEPOSITO;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSeIncrementeLaDeudaCuandoSeHaceUnaExtraccion() {
		CuentaCorriente cuenta = new CuentaCorriente();

		Registro registro = new Registro();
		
		final String MOTIVO_DEPOSITO = "Operación 00";
		final Double IMPORTE_DEPOSITO = 100.0;
		cuenta.depositar(IMPORTE_DEPOSITO);
		Transaccion transaccion = new Transaccion(MOTIVO_DEPOSITO, IMPORTE_DEPOSITO);
		registro.registrarTransaccion(transaccion);
		
		final String MOTIVO_EXTRACCION_1 = "Operación 01";
		final Double IMPORTE_EXTRACCION_1 = 200.0;
		cuenta.extraer(IMPORTE_EXTRACCION_1);
		Transaccion transaccion1 = new Transaccion(MOTIVO_EXTRACCION_1, IMPORTE_EXTRACCION_1);
		registro.registrarTransaccion(transaccion1);
		
		final String MOTIVO_EXTRACCION_2 = "Operación 02";
		final Double IMPORTE_EXTRACCION_2 = 50.0;
		cuenta.extraer(IMPORTE_EXTRACCION_2);
		Transaccion transaccion2 = new Transaccion(MOTIVO_EXTRACCION_2, IMPORTE_EXTRACCION_2);
		registro.registrarTransaccion(transaccion2);
		
		final Double VE = 157.50;
		
		final Double VO = cuenta.getDeuda();
		
		assertEquals(VE, VO);
	}
	
}

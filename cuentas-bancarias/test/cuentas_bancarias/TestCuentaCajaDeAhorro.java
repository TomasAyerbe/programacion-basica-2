package cuentas_bancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentaCajaDeAhorro {

	@Test
	public void queSePuedaCrearUnaCuentaCajaDeAhorro() {
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro();
		
		assertNotNull(cuenta);
	}

	@Test
	public void queSePuedaHacerUnDepositoEnUnaCuentaCajaDeAhorro() {
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro();
		
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
	public void queSePuedaHacerUnaExtraccionMenorAlSaldoEnUnaCuentaCajaDeAhorro() {
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro();
		
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
	public void queSePuedaHacerUnaExtraccionIgualAlSaldoEnUnaCuentaCajaDeAhorro() {
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro();
		
		Registro registro = new Registro();
		
		final String MOTIVO_DEPOSITO = "Operación 00";
		final Double IMPORTE_DEPOSITO = 100.0;
		
		cuenta.depositar(IMPORTE_DEPOSITO);
		
		Transaccion transaccion = new Transaccion(MOTIVO_DEPOSITO, IMPORTE_DEPOSITO);
		
		registro.registrarTransaccion(transaccion);
		
		final String MOTIVO_EXTRACCION = "Operación 01";
		final Double IMPORTE_EXTRACCION = 100.0;
		
		cuenta.extraer(IMPORTE_EXTRACCION);
		
		Transaccion transaccion1 = new Transaccion(MOTIVO_EXTRACCION, IMPORTE_EXTRACCION);
		
		registro.registrarTransaccion(transaccion1);
		
		assertNotNull(registro.getRegistro());
		
		final Double VE = IMPORTE_DEPOSITO - IMPORTE_EXTRACCION;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queNoSePuedaHacerUnaExtraccionMayorAlSaldoEnUnaCuentaCajaDeAhorro() {
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro();
		
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
		
		final Double VE = IMPORTE_DEPOSITO;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSeCobreAdicionalLuegoDeLaQuintaExtraccionEnUnaCuentaCajaDeAhorro() {
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro();
		
		Registro registro = new Registro();
		
		final String MOTIVO_DEPOSITO = "Operación 00";
		final Double IMPORTE_DEPOSITO = 1000.0;
		cuenta.depositar(IMPORTE_DEPOSITO);
		Transaccion transaccion = new Transaccion(MOTIVO_DEPOSITO, IMPORTE_DEPOSITO);
		registro.registrarTransaccion(transaccion);
		
		final String MOTIVO_EXTRACCION_1 = "Operación 01";
		final Double IMPORTE_EXTRACCION_1 = 10.0;
		cuenta.extraer(IMPORTE_EXTRACCION_1);
		Transaccion transaccion1 = new Transaccion(MOTIVO_EXTRACCION_1, IMPORTE_EXTRACCION_1);
		registro.registrarTransaccion(transaccion1);
		
		final String MOTIVO_EXTRACCION_2 = "Operación 02";
		final Double IMPORTE_EXTRACCION_2 = 20.0;
		cuenta.extraer(IMPORTE_EXTRACCION_2);
		Transaccion transaccion2 = new Transaccion(MOTIVO_EXTRACCION_2, IMPORTE_EXTRACCION_2);
		registro.registrarTransaccion(transaccion2);
		
		final String MOTIVO_EXTRACCION_3 = "Operación 03";
		final Double IMPORTE_EXTRACCION_3 = 30.0;
		cuenta.extraer(IMPORTE_EXTRACCION_3);
		Transaccion transaccion3 = new Transaccion(MOTIVO_EXTRACCION_3, IMPORTE_EXTRACCION_3);
		registro.registrarTransaccion(transaccion3);
		
		final String MOTIVO_EXTRACCION_4 = "Operación 04";
		final Double IMPORTE_EXTRACCION_4 = 40.0;
		cuenta.extraer(IMPORTE_EXTRACCION_4);
		Transaccion transaccion4 = new Transaccion(MOTIVO_EXTRACCION_4, IMPORTE_EXTRACCION_4);
		registro.registrarTransaccion(transaccion4);
		
		final String MOTIVO_EXTRACCION_5 = "Operación 05";
		final Double IMPORTE_EXTRACCION_5 = 50.0;
		cuenta.extraer(IMPORTE_EXTRACCION_5);
		Transaccion transaccion5 = new Transaccion(MOTIVO_EXTRACCION_5, IMPORTE_EXTRACCION_5);
		registro.registrarTransaccion(transaccion5);
		
		final String MOTIVO_EXTRACCION_6 = "Operación 06";
		final Double IMPORTE_EXTRACCION_6 = 60.0;
		cuenta.extraer(IMPORTE_EXTRACCION_6);
		Transaccion transaccion6 = new Transaccion(MOTIVO_EXTRACCION_6, IMPORTE_EXTRACCION_6);
		registro.registrarTransaccion(transaccion6);
		
		final Double IMPORTE_ADICIONAL = 6.0;
		
		final Double VE = IMPORTE_DEPOSITO - (IMPORTE_EXTRACCION_1 + IMPORTE_EXTRACCION_2 + IMPORTE_EXTRACCION_3 + IMPORTE_EXTRACCION_4 + IMPORTE_EXTRACCION_5 + IMPORTE_EXTRACCION_6 + IMPORTE_ADICIONAL);
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queNoSeCobreAdicionalAntesDeLaQuintaExtraccionEnUnaCuentaCajaDeAhorro() {
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro();

		Registro registro = new Registro();
		
		final String MOTIVO_DEPOSITO = "Operación 00";
		final Double IMPORTE_DEPOSITO = 1000.0;
		cuenta.depositar(IMPORTE_DEPOSITO);
		Transaccion transaccion = new Transaccion(MOTIVO_DEPOSITO, IMPORTE_DEPOSITO);
		registro.registrarTransaccion(transaccion);
		
		final String MOTIVO_EXTRACCION_1 = "Operación 01";
		final Double IMPORTE_EXTRACCION_1 = 10.0;
		cuenta.extraer(IMPORTE_EXTRACCION_1);
		Transaccion transaccion1 = new Transaccion(MOTIVO_EXTRACCION_1, IMPORTE_EXTRACCION_1);
		registro.registrarTransaccion(transaccion1);
		
		final String MOTIVO_EXTRACCION_2 = "Operación 02";
		final Double IMPORTE_EXTRACCION_2 = 20.0;
		cuenta.extraer(IMPORTE_EXTRACCION_2);
		Transaccion transaccion2 = new Transaccion(MOTIVO_EXTRACCION_2, IMPORTE_EXTRACCION_2);
		registro.registrarTransaccion(transaccion2);
		
		final String MOTIVO_EXTRACCION_3 = "Operación 03";
		final Double IMPORTE_EXTRACCION_3 = 30.0;
		cuenta.extraer(IMPORTE_EXTRACCION_3);
		Transaccion transaccion3 = new Transaccion(MOTIVO_EXTRACCION_3, IMPORTE_EXTRACCION_3);
		registro.registrarTransaccion(transaccion3);
		
		final String MOTIVO_EXTRACCION_4 = "Operación 04";
		final Double IMPORTE_EXTRACCION_4 = 40.0;
		cuenta.extraer(IMPORTE_EXTRACCION_4);
		Transaccion transaccion4 = new Transaccion(MOTIVO_EXTRACCION_4, IMPORTE_EXTRACCION_4);
		registro.registrarTransaccion(transaccion4);
		
		final Double VE = IMPORTE_DEPOSITO - (IMPORTE_EXTRACCION_1 + IMPORTE_EXTRACCION_2 + IMPORTE_EXTRACCION_3 + IMPORTE_EXTRACCION_4);
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queNoSeCobreAdicionalEnLaQuintaExtraccionEnUnaCuentaCajaDeAhorro() {
		CuentaCajaDeAhorro cuenta = new CuentaCajaDeAhorro();
		
		Registro registro = new Registro();
		
		final String MOTIVO_DEPOSITO = "Operación 00";
		final Double IMPORTE_DEPOSITO = 1000.0;
		cuenta.depositar(IMPORTE_DEPOSITO);
		Transaccion transaccion = new Transaccion(MOTIVO_DEPOSITO, IMPORTE_DEPOSITO);
		registro.registrarTransaccion(transaccion);
		
		final String MOTIVO_EXTRACCION_1 = "Operación 01";
		final Double IMPORTE_EXTRACCION_1 = 10.0;
		cuenta.extraer(IMPORTE_EXTRACCION_1);
		Transaccion transaccion1 = new Transaccion(MOTIVO_EXTRACCION_1, IMPORTE_EXTRACCION_1);
		registro.registrarTransaccion(transaccion1);
		
		final String MOTIVO_EXTRACCION_2 = "Operación 02";
		final Double IMPORTE_EXTRACCION_2 = 20.0;
		cuenta.extraer(IMPORTE_EXTRACCION_2);
		Transaccion transaccion2 = new Transaccion(MOTIVO_EXTRACCION_2, IMPORTE_EXTRACCION_2);
		registro.registrarTransaccion(transaccion2);
		
		final String MOTIVO_EXTRACCION_3 = "Operación 03";
		final Double IMPORTE_EXTRACCION_3 = 30.0;
		cuenta.extraer(IMPORTE_EXTRACCION_3);
		Transaccion transaccion3 = new Transaccion(MOTIVO_EXTRACCION_3, IMPORTE_EXTRACCION_3);
		registro.registrarTransaccion(transaccion3);
		
		final String MOTIVO_EXTRACCION_4 = "Operación 04";
		final Double IMPORTE_EXTRACCION_4 = 40.0;
		cuenta.extraer(IMPORTE_EXTRACCION_4);
		Transaccion transaccion4 = new Transaccion(MOTIVO_EXTRACCION_4, IMPORTE_EXTRACCION_4);
		registro.registrarTransaccion(transaccion4);
		
		final String MOTIVO_EXTRACCION_5 = "Operación 05";
		final Double IMPORTE_EXTRACCION_5 = 50.0;
		cuenta.extraer(IMPORTE_EXTRACCION_5);
		Transaccion transaccion5 = new Transaccion(MOTIVO_EXTRACCION_5, IMPORTE_EXTRACCION_5);
		registro.registrarTransaccion(transaccion5);
		
		final Double VE = IMPORTE_DEPOSITO - (IMPORTE_EXTRACCION_1 + IMPORTE_EXTRACCION_2 + IMPORTE_EXTRACCION_3 + IMPORTE_EXTRACCION_4 + IMPORTE_EXTRACCION_5);
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
}

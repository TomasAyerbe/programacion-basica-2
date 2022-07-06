package cuentas_bancarias;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TestCuentasBancarias {

	@Test
	public void queSePuedaHacerUnDepositoEnUnaCuenta() throws CuentaInexistenteException {
		final String nombreBanco = "SANTANDER";
		
		Banco banco = new Banco(nombreBanco);
		
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Long CBU_CLIENTE = 111111111111111L;
		final Double SALDO_CLIENTE = 150000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, CBU_CLIENTE, SALDO_CLIENTE);
		
		banco.agregarCuenta(cuenta);
		
		final String MOTIVO_TRANSACCION = "Depósito";
		final Double IMPORTE_TRANSACCION = 100.0; 
		final Integer NUMERO_TRANSACCION = 111111;
		
		banco.depositar(cuenta, IMPORTE_TRANSACCION);
		
		Transaccion transaccion = new Transaccion(MOTIVO_TRANSACCION, cuenta, IMPORTE_TRANSACCION, NUMERO_TRANSACCION);
		
		cuenta.registrarTransaccion(transaccion);
		
		final Double VE = SALDO_CLIENTE + IMPORTE_TRANSACCION;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}

	@Test
	public void queSePuedaHacerUnaExtraccionEnUnaCuenta() throws CuentaInexistenteException {
		final String nombreBanco = "SANTANDER";
		
		Banco banco = new Banco(nombreBanco);
		
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Long CBU_CLIENTE = 111111111111111L;
		final Double SALDO_CLIENTE = 150000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, CBU_CLIENTE, SALDO_CLIENTE);
		
		banco.agregarCuenta(cuenta);
		
		final String MOTIVO_TRANSACCION = "Extracción";
		final Double IMPORTE_TRANSACCION = 100.0;
		final Integer NUMERO_TRANSACCION = 111111;
		
		banco.extraer(cuenta, IMPORTE_TRANSACCION);
		
		Transaccion transaccion = new Transaccion(MOTIVO_TRANSACCION, cuenta, IMPORTE_TRANSACCION, NUMERO_TRANSACCION);
		
		cuenta.registrarTransaccion(transaccion);
		
		final Double VE = SALDO_CLIENTE - IMPORTE_TRANSACCION;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaHacerUnaTransferenciaEntreDosCuentasDelBanco() {
		final String nombreBanco = "SANTANDER";
		
		Banco banco = new Banco(nombreBanco);
		
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Long CBU_CLIENTE = 111111111111111L;
		final Double SALDO_CLIENTE = 150000.0;
		
		Cuenta cuentaOrigen = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, CBU_CLIENTE, SALDO_CLIENTE);
		
		banco.agregarCuenta(cuentaOrigen);
		
		final String NOMBRE_CLIENTE_2 = "Silvia Díaz";
		final Integer DNI_CLIENTE_2 = 26132598;
		final Long CBU_CLIENTE_2 = 222222222222222L;
		final Double SALDO_CLIENTE_2 = 2500000.0;
		
		Cuenta cuentaDestino = new CuentaCajaDeAhorro(NOMBRE_CLIENTE_2, DNI_CLIENTE_2, CBU_CLIENTE_2, SALDO_CLIENTE_2);
		
		final String MOTIVO_TRANSACCION = "Transferencia";
		final Double IMPORTE_TRANSACCION = 500.0;
		final Integer NUMERO_TRANSACCION = 111111;
		
		Transaccion transaccion = new Transaccion(MOTIVO_TRANSACCION, cuentaOrigen, cuentaDestino ,IMPORTE_TRANSACCION, NUMERO_TRANSACCION);
		
		cuentaOrigen.registrarTransaccion(transaccion);
		cuentaDestino.registrarTransaccion(transaccion);
		
		banco.transferenciaEntreCuentas(cuentaOrigen, cuentaDestino, transaccion);
		
		final Double VE = SALDO_CLIENTE - IMPORTE_TRANSACCION;
		final Double VO = cuentaOrigen.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test(expected = CuentaInexistenteException.class)
	public void queNoSePuedaHacerUnDepositoAUnaCuentaInexistente() throws CuentaInexistenteException {
		final String nombreBanco = "SANTANDER";
		
		Banco banco = new Banco(nombreBanco);
		
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Long CBU_CLIENTE = 111111111111111L;
		final Double SALDO_CLIENTE = 150000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, CBU_CLIENTE, SALDO_CLIENTE);
		
		final Double IMPORTE_TRANSACCION = 100.0;
		
		banco.depositar(cuenta, IMPORTE_TRANSACCION);
	}
	
	@Test(expected = CuentaInexistenteException.class)
	public void queNoSePuedaHacerUnaExtraccionAUnaCuentaInexistente() throws CuentaInexistenteException {
		final String nombreBanco = "SANTANDER";
		
		Banco banco = new Banco(nombreBanco);
		
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Long CBU_CLIENTE = 111111111111111L;
		final Double SALDO_CLIENTE = 150000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, CBU_CLIENTE, SALDO_CLIENTE);
		
		final Double IMPORTE_TRANSACCION = 100.0;
		
		banco.extraer(cuenta, IMPORTE_TRANSACCION);
	}
	
	@Test
	public void queSePuedanHacerYListarDosMovimientosEnUnaCuenta() throws CuentaInexistenteException {
		final String nombreBanco = "SANTANDER";
		
		Banco banco = new Banco(nombreBanco);
		
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Long CBU_CLIENTE = 111111111111111L;
		final Double SALDO_CLIENTE = 150000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, CBU_CLIENTE, SALDO_CLIENTE);
		
		banco.agregarCuenta(cuenta);
		
		final String MOTIVO_TRANSACCION = "Depósito";
		final Double IMPORTE_TRANSACCION = 100.0; 
		final Integer NUMERO_TRANSACCION = 111111;
		
		banco.depositar(cuenta, IMPORTE_TRANSACCION);
		
		Transaccion transaccion = new Transaccion(MOTIVO_TRANSACCION, cuenta, IMPORTE_TRANSACCION, NUMERO_TRANSACCION);
		
		cuenta.registrarTransaccion(transaccion);
		
		final String MOTIVO_TRANSACCION_2 = "Extracción";
		final Double IMPORTE_TRANSACCION_2 = 50.0;
		final Integer NUMERO_TRANSACCION_2 = 222222;
		
		banco.extraer(cuenta, IMPORTE_TRANSACCION_2);
		
		Transaccion transaccion2 = new Transaccion(MOTIVO_TRANSACCION_2, cuenta, IMPORTE_TRANSACCION_2, NUMERO_TRANSACCION_2);
		
		cuenta.registrarTransaccion(transaccion2);
		
		Collections.sort(cuenta.getListaTransacciones());
		
		List<Transaccion>listaTransaccionesEsperada = new LinkedList<Transaccion>();
		
		listaTransaccionesEsperada.add(transaccion);
		listaTransaccionesEsperada.add(transaccion2);
		
		assertEquals(listaTransaccionesEsperada, cuenta.getListaTransacciones());
	}
	
}

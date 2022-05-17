package cuentas_bancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBanco {

	@Test
	public void queSePuedaCrearUnBanco() {
		final String nombreBanco = "SANTANDER";
		
		Banco banco = new Banco(nombreBanco);
		
		assertNotNull(banco);
	}
	
	@Test
	public void queSePuedaCrearUnBancoConUnaCuenta() {
		final String nombreBanco = "SANTANDER";
		
		Banco banco = new Banco(nombreBanco);
		
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Double SALDO_CLIENTE = 150000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE);
		
		banco.agregarCuenta(cuenta);
		
		assertNotNull(banco.getCuentas());
	}
	
	@Test
	public void queSePuedaCrearUnBancoConMasDeUnaCuenta() {
		final String nombreBanco = "SANTANDER";
		
		Banco banco = new Banco(nombreBanco);
		
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Double SALDO_CLIENTE = 150000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE);
		
		banco.agregarCuenta(cuenta);
		
		final String NOMBRE_CLIENTE_2 = "Silvia Fernandez";
		final Integer DNI_CLIENTE_2 = 26132598;
		final Double SALDO_CLIENTE_2 = 2500000.0;
		
		Cuenta cuenta2 = new CuentaCajaDeAhorro(NOMBRE_CLIENTE_2, DNI_CLIENTE_2, SALDO_CLIENTE_2);
		
		banco.agregarCuenta(cuenta2);
	}
	
	@Test
	public void queSePuedaHacerUnaTransferenciaEntreDosCuentasDelBanco() {
		final String nombreBanco = "SANTANDER";
		
		Banco banco = new Banco(nombreBanco);
		
		Registro registro = new Registro();
		
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Double SALDO_CLIENTE = 150000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE);
		
		banco.agregarCuenta(cuenta);
		
		final String NOMBRE_CLIENTE_2 = "Silvia Fernandez";
		final Integer DNI_CLIENTE_2 = 26132598;
		final Double SALDO_CLIENTE_2 = 2500000.0;
		
		Cuenta cuenta2 = new CuentaCajaDeAhorro(NOMBRE_CLIENTE_2, DNI_CLIENTE_2, SALDO_CLIENTE_2);
		
		final String MOTIVO_TRANSACCION = "Operación 00";
		final Double IMPORTE_TRANSACCION = 500.0;
		
		Transaccion transaccion = new Transaccion(MOTIVO_TRANSACCION, IMPORTE_TRANSACCION);
		
		registro.registrarTransaccion(transaccion);
		
		banco.transferenciaEntreCuentas(cuenta, cuenta2, transaccion);
		
		final Double VE = SALDO_CLIENTE - IMPORTE_TRANSACCION;
		
		final Double VO = banco.getCuentas().get(0).getSaldo();
		
		assertEquals(VE, VO);
	}
	
}

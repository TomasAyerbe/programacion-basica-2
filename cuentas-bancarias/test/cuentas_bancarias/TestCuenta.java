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
	
	@Test
	public void queSePuedaHacerUnDepositoEnUnaCuenta() {
		Cuenta cuenta = new Cuenta();
		
		cuenta.depositar(500.0);
		
		final Double VE = 500.0;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaHacerUnaExtraccionEnUnaCuenta() {
		Cuenta cuenta = new Cuenta();
		
		cuenta.depositar(500.0);
		
		cuenta.extraer(400.0);
		
		final Double VE = 100.0;
		
		final Double VO = cuenta.getSaldo();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queUnClientePuedaTenerUnaCuentaConSusDatos() {
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Double SALDO_CLIENTE = 150000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE);
		
		assertNotNull(cuenta);
	}
	
	@Test
	public void queUnClientePuedaTenerMasDeUnaCuentaConSusDatos() {
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Double SALDO_CLIENTE = 150000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE);
		
		assertNotNull(cuenta);
		
		final Double SALDO_CLIENTE_2 = 200000.0;
		
		Cuenta cuenta2 = new CuentaCajaDeAhorro(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE_2);
		
		assertNotNull(cuenta2);
		
		final Double SALDO_CLIENTE_3 = 250000.0;
		
		Cuenta cuenta3 = new CuentaCorriente(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE_3);
		
		assertNotNull(cuenta3);
	}
	
	@Test
	public void queUnClienteSeaVIPSiTieneMasDeUnMillonDePesosEnSusCuentasYNingunaConSaldoNegativo() {
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Double SALDO_CLIENTE = 500000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE);
		
		final Double SALDO_CLIENTE_2 = 600000.0;
		
		Cuenta cuenta2 = new CuentaCajaDeAhorro(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE_2);
		
		Boolean esVIP = Cuenta.comprobarVIP(cuenta, cuenta.getSaldo() + cuenta2.getSaldo());
	
		assertTrue(esVIP);
		
		assertNotNull(VIP.getClientesVIP());
	}

	@Test
	public void queUnClienteNoSeaVIPSiTieneMasDeUnMillonDePesosEnSusCuentasYAlgunaConSaldoNegativo() {
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Double SALDO_CLIENTE = -50000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE);
		
		final Double SALDO_CLIENTE_2 = 2500000.0;
		
		Cuenta cuenta2 = new CuentaCajaDeAhorro(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE_2);
		
		Boolean esVIP = Cuenta.comprobarVIP(cuenta, cuenta.getSaldo() + cuenta2.getSaldo());
		
		assertFalse(esVIP);
		
		assertNotNull(VIP.getClientesVIP());
	}
	
	@Test
	public void queUnClienteNoSeaVIPSiNoTieneMasDeUnMillonDePesosEnSusCuentasYNingunaConSaldoNegativo() {
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Double SALDO_CLIENTE = 50000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE);
		
		final Double SALDO_CLIENTE_2 = 100000.0;
		
		Cuenta cuenta2 = new CuentaCajaDeAhorro(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE_2);
		
		Boolean esVIP = Cuenta.comprobarVIP(cuenta, cuenta.getSaldo() + cuenta2.getSaldo());
		
		assertFalse(esVIP);
		
		assertNotNull(VIP.getClientesVIP());
	}
	
	@Test
	public void queUnClienteNoSeaVIPSiNoTieneMasDeUnMillonDePesosEnSusCuentasYAlgunaConSaldoNegativo() {
		final String NOMBRE_CLIENTE = "Juan Pérez";
		final Integer DNI_CLIENTE = 38562184;
		final Double SALDO_CLIENTE = -50000.0;
		
		Cuenta cuenta = new CuentaSueldo(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE);
		
		final Double SALDO_CLIENTE_2 = 100000.0;
		
		Cuenta cuenta2 = new CuentaCajaDeAhorro(NOMBRE_CLIENTE, DNI_CLIENTE, SALDO_CLIENTE_2);
		
		Boolean esVIP = Cuenta.comprobarVIP(cuenta, cuenta.getSaldo() + cuenta2.getSaldo());
		
		assertFalse(esVIP);
		
		assertNotNull(VIP.getClientesVIP());
	}
	
}

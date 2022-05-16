package cuentas_bancarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTransacciones {

	@Test
	public void queSePuedaCrearUnRegistroDeTransacciones() {
		Registro registro = new Registro();
				
		assertNotNull(registro);
	}

	@Test
	public void queSePuedaRegistrarUnaTransaccionConMotivoEImporte() {
		Registro registro = new Registro();
		
		final String MOTIVO_TRANSACCION = "Operación 00";
		final Double IMPORTE_TRANSACCION = 500.0;
		
		Transaccion transaccion = new Transaccion(MOTIVO_TRANSACCION, IMPORTE_TRANSACCION);
		
		registro.registrarTransaccion(transaccion);
		
		assertNotNull(registro.getRegistro());
	}
	
}

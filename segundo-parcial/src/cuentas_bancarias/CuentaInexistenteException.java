package cuentas_bancarias;

public class CuentaInexistenteException extends Exception {
	
	public CuentaInexistenteException (String mensaje) {
		super(mensaje);
	}
	
}

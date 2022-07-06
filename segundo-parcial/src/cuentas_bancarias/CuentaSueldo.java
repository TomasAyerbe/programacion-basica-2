package cuentas_bancarias;

public class CuentaSueldo extends Cuenta {
	
	public CuentaSueldo () {
		super();
	}
	
	public CuentaSueldo (String nombre, Integer dni, Long cbu ,Double saldo) {
		super(nombre, dni, cbu, saldo);
	}
	
}

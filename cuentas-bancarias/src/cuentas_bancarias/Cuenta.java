package cuentas_bancarias;

public class Cuenta {
	
	protected Double saldo;
	private String nombre;
	private Integer dni;
	
	public Cuenta () {
		saldo = 0.0;
	}

	public Cuenta (String nombre, Integer dni, Double saldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Integer getDni() {
		return this.dni;
	}
		
	public Boolean depositar(Double importeDeposito) {
		this.saldo += importeDeposito;
		return true;
	}
	
	public Boolean extraer(Double importeExtraccion) {
		if (importeExtraccion <= this.saldo) {
			this.saldo -= importeExtraccion;
			return true;
		}
		
		return false;
	}
	
	public static Boolean comprobarVIP(Cuenta cuenta, Double saldoTotal) {
		if ((saldoTotal >= 1000000.00) && (cuenta.getSaldo() > 0)) {
			VIP clienteVIP = new VIP(cuenta.getNombre(), cuenta.getDni(), saldoTotal);
			clienteVIP.agregarVIP(clienteVIP);
			return true;
		} 

		return false;
	}
	
}

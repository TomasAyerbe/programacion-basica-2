package cuentas_bancarias;

public class CuentaCajaDeAhorro {

	private Double saldo;

	public CuentaCajaDeAhorro (Double saldo) {
		this.saldo = saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void depositar(Double importeDeposito) {
		this.saldo += importeDeposito;
	}

	public void extraer(Double importeExtraccion) {
		if (importeExtraccion <= saldo) {
			this.saldo -= importeExtraccion;
		}
	}
	
	public void extraccionConAdicional(Double importeExtraccion) {
		if (importeExtraccion <= saldo) {
			this.saldo -= (importeExtraccion + 6.0);
		}
	}
	
}

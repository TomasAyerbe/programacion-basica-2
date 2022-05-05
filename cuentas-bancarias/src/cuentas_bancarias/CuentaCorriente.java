package cuentas_bancarias;

public class CuentaCorriente {
	
	private Double saldo;
	private Double montoDescubierto;

	public CuentaCorriente (Double saldo, Double montoDescubierto) {
		this.saldo = saldo;
		this.montoDescubierto = montoDescubierto;
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
		} else {
			this.saldo = (saldo - importeExtraccion) * 1.05;
		}
	}
	

}

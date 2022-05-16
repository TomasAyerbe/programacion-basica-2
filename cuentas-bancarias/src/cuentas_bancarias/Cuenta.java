package cuentas_bancarias;

public class Cuenta {
	
	protected Double saldo;
	
	public Cuenta () {
		saldo = 0.0;
	}

	public Double getSaldo() {
		return this.saldo;
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
	
	
}

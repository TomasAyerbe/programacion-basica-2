package cuentas_bancarias;

public class CuentaCorriente extends Cuenta{
	
	private final Double MONTO_DESCUBIERTO = 150.0;
	private final Double COMISION = 1.05;
	private Double descubiertoActual = 0.0;
	private Double deuda = 0.0;
	
	public CuentaCorriente () {
		super();
	}
	
	public CuentaCorriente (String nombre, Integer dni, Double saldo) {
		super(nombre, dni, saldo);
	}
	
	public Double getMontoDescubierto() {
		return MONTO_DESCUBIERTO;
	}
	
	public Double getDeuda() {
		return this.deuda;
	}

	//Sobreescritura
	@Override
	public Boolean extraer(Double importeExtraccion) {
		Double descubiertoInicial = descubiertoActual;
		if (importeExtraccion <= saldo) {
			this.saldo -= importeExtraccion;
			return true;
		} else {
			if (importeExtraccion <= (saldo + (MONTO_DESCUBIERTO - descubiertoActual))) {
				this.descubiertoActual += (importeExtraccion - saldo);
				this.deuda += (descubiertoActual - descubiertoInicial) * COMISION; 
				this.saldo = 0.0;
				return true;
			}
		}
		
		return false;
	}
	
}

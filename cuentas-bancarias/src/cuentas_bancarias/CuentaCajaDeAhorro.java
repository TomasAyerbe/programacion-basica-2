package cuentas_bancarias;

public class CuentaCajaDeAhorro extends Cuenta{

	private final Double IMPORTE_ADICIONAL = 6.0;
	private Integer cantidadExtracciones = 0;
	
	public CuentaCajaDeAhorro () {
		super();
	}
	
	public Double getCobroAdicional() {
		return IMPORTE_ADICIONAL;
	}
	
	//Sobreescritura
	@Override
	public Boolean extraer(Double importeExtraccion) {
		if (cantidadExtracciones < 5) {
			if (importeExtraccion <= saldo) {
				this.saldo -= importeExtraccion;
				cantidadExtracciones++;
				return true;
			}
		} else {
			if (importeExtraccion <= (saldo + IMPORTE_ADICIONAL)) {
				this.saldo -= (importeExtraccion + IMPORTE_ADICIONAL);
				cantidadExtracciones++;
				return true;
			}
		}
		
		return false;
	}
	
}

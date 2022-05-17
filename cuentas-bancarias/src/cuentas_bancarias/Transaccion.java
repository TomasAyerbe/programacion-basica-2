package cuentas_bancarias;

public class Transaccion {
		
	private String motivoTransaccion;
	private Double importeTransaccion;

	public Transaccion (String motivoTransaccion, Double importeTransaccion) {
		this.motivoTransaccion = motivoTransaccion;
		this.importeTransaccion = importeTransaccion;
	}
	
	public String getmotivoTransaccion() {
		return motivoTransaccion;
	}
	
	public Double getimporteTransaccion() {
		return importeTransaccion;
	}
	
}

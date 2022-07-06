package cuentas_bancarias;

public class Transaccion implements Comparable<Transaccion> {

	private String motivoTransaccion;
	private Double importeTransaccion;
	protected Cuenta cuenta;
	protected Cuenta cuentaOrigen;
	protected Cuenta cuentaDestino;
	private Integer numeroTransaccion;
	
	//CONSTRUCTOR PARA LAS TRANSACCIONES DE TIPO DEPÓSITO/EXTRACCIÓN QUE REQUIEREN SOLO UNA CUENTA.
	public Transaccion (String motivoTransaccion, Cuenta cuenta, Double importeTransaccion, Integer numeroTransaccion) {
		this.motivoTransaccion = motivoTransaccion;
		this.cuenta = cuenta;
		this.importeTransaccion = importeTransaccion;
		this.numeroTransaccion = numeroTransaccion;
	}
	
	//CONSTRUCTOR PARA LAS TRANSACCIONES DE TIPO TRANSFERENCIA QUE REQUIEREN UNA CUENTA DE ORIGEN Y OTRA DE DESTINO.
	public Transaccion (String motivoTransaccion, Cuenta cuentaOrigen, Cuenta cuentaDestino, Double importeTransaccion, Integer numeroTransaccion) {
		this.motivoTransaccion = motivoTransaccion;
		this.cuentaOrigen = cuentaOrigen;
		this.cuentaDestino = cuentaDestino;
		this.importeTransaccion = importeTransaccion;
		this.numeroTransaccion = numeroTransaccion;
	}

	public String getmotivoTransaccion() {
		return motivoTransaccion;
	}
	
	public Double getimporteTransaccion() {
		return importeTransaccion;
	}

	public Integer getNumeroTransaccion() {
		return numeroTransaccion;
	}

	@Override
	public int compareTo(Transaccion transaccion) {
		int resultado = 0;
		
		if (this.getNumeroTransaccion() < transaccion.getNumeroTransaccion()) {
			resultado = -1;
		} else if (this.getNumeroTransaccion() > transaccion.getNumeroTransaccion()) {
			resultado = 1;
		}
		
		return resultado;
	}
	
}

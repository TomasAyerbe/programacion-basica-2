package cuentas_bancarias;

import java.util.LinkedList;
import java.util.List;

public class Cuenta {
	
	protected Double saldo;
	private String nombre;
	private Integer dni;
	private Long cbu;
	
	protected List<Transaccion> listaTransacciones = new LinkedList<Transaccion>();
	
	public Cuenta () {
		saldo = 0.0;
	}

	public Cuenta (String nombre, Integer dni, Long cbu, Double saldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.cbu = cbu;
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Integer getDni() {
		return dni;
	}
		
	public Long getCbu() {
		return cbu;
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
	
	public void registrarTransaccion(Transaccion transaccion) {
		listaTransacciones.add(transaccion);
	}
	
	public List<Transaccion> getListaTransacciones() {
		return listaTransacciones;
	}
	
}

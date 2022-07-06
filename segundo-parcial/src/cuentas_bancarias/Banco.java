package cuentas_bancarias;

import java.util.HashSet;
import java.util.Set;

public class Banco {
	
	protected String nombreBanco;
	
	private Set<Cuenta>cuentas = new HashSet<Cuenta>();
	
	public Banco (String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	
	public void agregarCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
	}
	
	public Set<Cuenta> getCuentas() {
		return cuentas;
	}
	
	public void depositar(Cuenta cuenta, Double importeTransaccion) throws CuentaInexistenteException {
		Boolean deposito = false;
		
		//COMPRUEBO QUE HAYA UNA CUENTA CON EL CBU DE LA CUENTA A DEPOSITAR Y, SI ES ASÍ, REALIZA EL DEPÓSITO
		//O LANZA LA EXCEPCIÓN EN CASO CONTRARIO.
		for (Cuenta c: cuentas) {
			if (c.getCbu().equals(cuenta.getCbu())) {
				cuenta.depositar(importeTransaccion);
				deposito = true;
			}
		}
		
		if (!deposito) {
			throw new CuentaInexistenteException("No existe la cuenta a la que se quiere depositar.");
		}
	}
	
	public void extraer(Cuenta cuenta, Double importeTransaccion) throws CuentaInexistenteException {
		Boolean extraccion = false;
		
		//COMPRUEBO QUE HAYA UNA CUENTA CON EL CBU DE LA CUENTA A EXTRAER Y, SI ES ASÍ, REALIZA LA EXTRACCIÓN
		//O LANZA LA EXCEPCIÓN EN CASO CONTRARIO.
		for (Cuenta c: cuentas) {
			if (c.getCbu().equals(cuenta.getCbu())) {
				cuenta.extraer(importeTransaccion);
				extraccion = true;
			}
		}
		
		if (!extraccion) {
			throw new CuentaInexistenteException("No existe la cuenta a la que se quiere depositar.");
		}
	}

	public void transferenciaEntreCuentas(Cuenta cuentaEmisor, Cuenta cuentaReceptor, Transaccion transaccion) {
		//COMPRUEBO QUE HAYA UNA CUENTA CON EL CBU DE LA CUENTA EMISOR
		for (Cuenta c: cuentas) {
			if (c.getCbu().equals(cuentaEmisor.getCbu())) {
				cuentaEmisor.extraer(transaccion.getimporteTransaccion());
			}
		}	
		//COMPRUEBO QUE HAYA UNA CUENTA CON EL CBU DE LA CUENTA RECEPTOR
		for (Cuenta c: cuentas) {
			if (c.getCbu().equals(cuentaReceptor.getCbu())) {
				cuentaReceptor.depositar(transaccion.getimporteTransaccion());
			}
		}
	}
	
}

package cuentas_bancarias;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nombreBanco;
	
	protected List<Cuenta>cuentas = new ArrayList<Cuenta>();
	
	public Banco (String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	
	public void agregarCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
	}
	
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void transferenciaEntreCuentas(Cuenta cuentaEmisor, Cuenta cuentaReceptor, Transaccion transaccion) {
		for (int i=0; i<cuentas.size(); i++) {
			
			if (cuentas.get(i).getDni().equals(cuentaEmisor.getDni())) {
				
				cuentas.get(i).extraer(transaccion.getimporteTransaccion());
				
				for (int j=0; j<cuentas.size(); j++) {
					
					if (cuentas.get(j).getDni().equals(cuentaReceptor.getDni())) {
						cuentas.get(j).depositar(transaccion.getimporteTransaccion());
					}
					
				}
				
			}
			
		}
		
	}
	
}

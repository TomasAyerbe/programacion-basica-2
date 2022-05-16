package cuentas_bancarias;

import java.util.LinkedList;
import java.util.List;

public class Registro {

	protected List<Transaccion>registro = new LinkedList<Transaccion>();
	
	public void registrarTransaccion(Transaccion transaccion) {
		this.registro.add(transaccion);
	}

	public List<Transaccion> getRegistro() {
		return registro;
	}
	
}

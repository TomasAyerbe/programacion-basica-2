package cuentas_bancarias;

import java.util.ArrayList;
import java.util.List;

public class VIP {
	
	private String nombre;
	private Integer dni;
	private Double saldoTotal;
	
	protected static List<VIP>clientesVIP = new ArrayList<VIP>();

	public VIP (String nombre, Integer dni, Double saldoTotal) {
		this.nombre = nombre;
		this.dni = dni;
		this.saldoTotal = saldoTotal;
	}
	
	public void agregarVIP(VIP clienteVIP) {
		clientesVIP.add(clienteVIP);
	}
	
	public static List<VIP> getClientesVIP() {
		return clientesVIP;
	}
	
}

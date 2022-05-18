package empresa_la_perseverancia;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private Integer cuit;
	private String razonSocial;
	
	protected List<Empleado>empleados = new ArrayList<Empleado>();
	
	public Empresa (Integer cuit, String razonSocial) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public Double calcularTotalSueldos() {
		Double sumaTotalSueldos = 0.0;
		
		for (int i=0; i<this.empleados.size(); i++) {
			sumaTotalSueldos += empleados.get(i).calcularSueldo();
		}
		
		return sumaTotalSueldos;
	}
	
}

package empresa_la_perseverancia;

public class Empleado {
	
	private Integer horasTrabajadas;
	private Integer aniosAntiguedad;
	protected Integer hijos;
	protected Boolean casado;
	private Double valorHora;
	private Double valorAniosAntiguedad;
	
	public Empleado (Integer horasTrabajadas, Integer aniosAntiguedad, Integer hijos, Boolean casado, Double valorHora, Double valorAniosAntiguedad) {
		this.horasTrabajadas = horasTrabajadas;
		this.aniosAntiguedad = aniosAntiguedad;
		this.hijos = hijos;
		this.casado = casado;
		this.valorHora = valorHora;
		this.valorAniosAntiguedad = valorAniosAntiguedad;
	}
	
	public Empleado(Integer horasTrabajadas, Integer hijos, Boolean casado, Double valorHora) {
		this.horasTrabajadas = horasTrabajadas;
		this.hijos = hijos;
		this.casado = casado;
		this.valorHora = valorHora;
	}

	public Double calcularSueldo() {
		Double sueldo = (getHorasTrabajadas() * getValorHora()) + (calcularSalarioFamiliar(hijos, casado));
		
		return sueldo;
	}
	
	public Double calcularSalarioFamiliar (Integer hijos, Boolean casado) {
		Double salarioFamiliar;
		
		if (casado == true) {
			salarioFamiliar = (double) (100 + (200 * hijos));
		} else {
			salarioFamiliar = (double) (200 * hijos);
		}
		
		return salarioFamiliar;
	}
	
	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public Integer getAniosAntiguedad() {
		return aniosAntiguedad;
	}
	
	public Integer getHijos() {
		return hijos;
	}
	
	public Boolean getCasado() {
		return casado;
	}
	
	public Double getValorHora() {
		return valorHora;
	}
	
	public Double getValorAniosAntiguedad() {
		return valorAniosAntiguedad;
	}
	
}

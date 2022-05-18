package empresa_la_perseverancia;

public class EmpleadoPlantaPermanente extends Empleado{
	
	public EmpleadoPlantaPermanente (Integer horasTrabajadas, Integer aniosAntiguedad, Integer hijos, Boolean casado, Double valorHora, Double valorAniosAntiguedad) {
		super (horasTrabajadas, aniosAntiguedad, hijos, casado, valorHora, valorAniosAntiguedad);
	}
	
	@Override
	public Double calcularSueldo() {
		Double sueldo = (getHorasTrabajadas() * getValorHora()) + (getAniosAntiguedad() * getValorAniosAntiguedad()) + (calcularSalarioFamiliar(hijos, casado));
		
		return sueldo;
	}
	
}

package tp_amarras;

public class Motor extends Yate {
	
	protected Double desplazamiento;
	protected String propulsion;
	protected Double potencia;
	protected Double velocidad;
	protected Double autonomia;

	public Motor (String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion, Double peso, Double desplazamiento, String propulsion, Double potencia, Double velocidad, Double autonomia) {
		super (nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.desplazamiento = desplazamiento;
		this.propulsion = propulsion;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}

	@Override
	protected Double getPrecioAmarre() {
		Double precioAmarre = 10000.0;
		
		if(getEslora() <= 20.0) {
			precioAmarre += 2000.0;
		} else {
			precioAmarre += 3000.0;
		}
		
		return precioAmarre;
	}

}

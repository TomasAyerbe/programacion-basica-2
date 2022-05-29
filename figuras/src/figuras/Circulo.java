package figuras;

public class Circulo extends Figura {
	
	private Double radio;
	private final Double PI = 3.14159;
	
	public Circulo (String nombre, Double radio) {
		super (nombre);
		this.radio = radio;
	}
	
	public Circulo (String nombre, String color, Double radio) {
		super (nombre, color);
		this.radio = radio;
	}
	
	public Double calcularArea() {
		return (PI * (radio * radio));
	}
	
}

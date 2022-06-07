package figuras;

public class Cuadrado extends Figura {

	private Double lado;

	public Cuadrado (String nombre, Double lado) {
		super (nombre);
		this.lado = lado;
	}
	
	public Cuadrado (String nombre, String color, Double lado) {
		super (nombre, color);
		this.lado = lado;
	}
	
	@Override
	public Double calcularArea() {
		return (lado * lado);
	}
	
}

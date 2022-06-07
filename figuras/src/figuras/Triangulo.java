package figuras;

public class Triangulo extends Figura {

	private Double base;
	private Double altura;
	
	public Triangulo (String nombre, Double base, Double altura) {
		super (nombre);
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo (String nombre, String color, Double base, Double altura) {
		super (nombre, color);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public Double calcularArea() {
		return ((base * altura) / 2);
	}
	
}

package figuras;

public abstract class Figura {
	
	protected String nombre;
	protected String color;
	
	Figura (String nombre) {
		this.nombre = nombre;
	}
	
	Figura (String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}

	public abstract Double calcularArea();

}

package tp_figuras_geometricas;

public class Elipse extends Figura {

	private Punto centro;
	private Double radioMayor;
	private Double radioMenor;
	private final Double PI = 3.14159;
	
	public Elipse (Punto centro, Double radioMayor, Double radioMenor) {
		this.setCentro(centro);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}
	
	public Punto getCentro() {
		return centro;
	}
	
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	
	public Boolean esCirculo() {
		if (radioMayor == radioMenor) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public Double calcularArea() {
		if (esCirculo()) {
			return (PI * (radioMayor * radioMayor));
		} else {
			return (PI * radioMayor * radioMenor);
		}
	}

}

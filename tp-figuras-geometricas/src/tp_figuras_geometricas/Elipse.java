package tp_figuras_geometricas;

public class Elipse extends Figura {

	private Punto centro;
	
	public Elipse (Punto centro, Double radioMayor, Double radioMenor) {
		super (centro, radioMayor, radioMenor);
	}
	
	public Punto getCentro() {
		return centro;
	}
	
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	
	@Override
	public Double calcularArea() {
		return (Math.PI * getLadoRadioMayor() * getLadoRadioMenor());
	}

}

package tp_figuras_geometricas;

public class Circulo extends Elipse {

	public Circulo (Punto centro, Double radioMayor, Double radioMenor) {
		super (centro, radioMayor, radioMenor);
	}
	
	@Override
	public Double calcularArea() {
		return (Math.PI * (Math.pow(getLadoRadioMayor(), 2.0)));
	}

}
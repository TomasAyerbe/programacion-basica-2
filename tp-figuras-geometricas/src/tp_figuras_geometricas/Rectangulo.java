package tp_figuras_geometricas;

public class Rectangulo extends Figura {

	private Punto esquinaSuperiorDerecha;
	
	public Rectangulo (Punto esquinaInferiorIzquierda, Punto esquinaSuperiorDerecha, Double base, Double altura) {
		super (esquinaInferiorIzquierda, base, altura);
		this.setEsquinaSuperiorDerecha(esquinaSuperiorDerecha);
	}
	
	public Punto getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}

	public void setEsquinaSuperiorDerecha(Punto esquinaSuperiorDerecha) {
		this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
	}
	
	private void calcularEsquinaSuperiorDerecha() {
		Double X = getPosicion().getX() + getLadoRadioMayor();
		Double Y = getPosicion().getY() + getLadoRadioMenor();
		Punto punto = new Punto(X, Y);
		this.esquinaSuperiorDerecha = punto;
	}
	
	@Override
	public Double calcularArea() {
		return (getLadoRadioMayor() * getLadoRadioMenor());	
	}

	@Override
	public void setPosicion(Punto punto) {
		super.setPosicion(punto);
		calcularEsquinaSuperiorDerecha();
	}

}

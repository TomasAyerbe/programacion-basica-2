package tp_figuras_geometricas;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado (Punto esquinaInferiorIzquierda, Punto esquinaSuperiorDerecha, Double base, Double altura) {
		super (esquinaInferiorIzquierda, esquinaSuperiorDerecha, base, altura);
	}
	
	@Override
	public Double calcularArea() {
		return (Math.pow(getLadoRadioMayor(), 2.0));
	}
	
}

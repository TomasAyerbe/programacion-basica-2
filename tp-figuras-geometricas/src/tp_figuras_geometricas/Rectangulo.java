package tp_figuras_geometricas;

public class Rectangulo extends Figura {

	private Punto esquinaInferiorIzquierda;
	private Punto esquinaSuperiorDerecha;

	public Rectangulo (Punto esquinaInferiorIzquierda, Punto esquinaSuperiorDerecha) {
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
		this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
	}
	
	public Boolean esCuadrado() {
		if ( (esquinaSuperiorDerecha.getX() - esquinaInferiorIzquierda.getX()) == (esquinaSuperiorDerecha.getY() - esquinaInferiorIzquierda.getY()) ) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public Double calcularArea() {
		if (esCuadrado()) {
			return ( (esquinaSuperiorDerecha.getX() - esquinaInferiorIzquierda.getX()) * 2 );
		} else {
			return ( (esquinaSuperiorDerecha.getX() - esquinaInferiorIzquierda.getX()) * (esquinaSuperiorDerecha.getY() - esquinaInferiorIzquierda.getY()) );
		}	
	}

}

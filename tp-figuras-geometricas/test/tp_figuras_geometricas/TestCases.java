package tp_figuras_geometricas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnaElipse() {
		final Double RADIO_MAYOR = 10.0;
		final Double RADIO_MENOR = 5.0;
		final Double X = 0.0;
		final Double Y = 0.0;
		
		Punto centro = new Punto(X, Y);
		
		Figura figura = new Elipse(centro, RADIO_MAYOR, RADIO_MENOR);
		
		assertNotNull(figura);
	}

	@Test
	public void queSePuedaCrearUnCirculo() {
		final Double RADIO_MAYOR = 5.0;
		final Double RADIO_MENOR = 5.0;
		final Double X = 0.0;
		final Double Y = 0.0;
		
		Punto centro = new Punto(X, Y);
		
		Figura figura = new Elipse(centro, RADIO_MAYOR, RADIO_MENOR);
		
		assertNotNull(figura);
	}
	
	@Test
	public void queSePuedaCrearUnRectangulo() {
		final Double X_ESQUINA_INFERIOR_IZQUIERDA = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA = 10.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA = 15.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA = 25.0;
		
		Punto esquinaInferiorIzquierda = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA, Y_ESQUINA_INFERIOR_IZQUIERDA);
		Punto esquinaSuperiorDerecha = new Punto(X_ESQUINA_SUPERIOR_DERECHA, Y_ESQUINA_SUPERIOR_DERECHA);
		
		Figura figura = new Rectangulo(esquinaInferiorIzquierda, esquinaSuperiorDerecha);
		
		assertNotNull(figura);
	}
	
	@Test
	public void queSePuedaCrearUnCuadrado() {
		final Double X_ESQUINA_INFERIOR_IZQUIERDA = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA = 5.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA = 25.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA = 25.0;
		
		Punto esquinaInferiorIzquierda = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA, Y_ESQUINA_INFERIOR_IZQUIERDA);
		Punto esquinaSuperiorDerecha = new Punto(X_ESQUINA_SUPERIOR_DERECHA, Y_ESQUINA_SUPERIOR_DERECHA);
		
		Figura figura = new Rectangulo(esquinaInferiorIzquierda, esquinaSuperiorDerecha);
		
		assertNotNull(figura);
	}
	
	
}

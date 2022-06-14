package tp_figuras_geometricas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnaElipse() {
		final Double RADIO_MAYOR = 10.0;
		final Double RADIO_MENOR = 5.0;
		final Double X = 0.0;
		final Double Y = 0.0;
		
		Punto centro = new Punto(X, Y);
		
		Elipse elipse = new Elipse(centro, RADIO_MAYOR, RADIO_MENOR);
		
		assertNotNull(elipse);
	}

	@Test
	public void queSePuedaCrearUnCirculo() {
		final Double RADIO_MAYOR = 5.0;
		final Double RADIO_MENOR = 5.0;
		final Double X = 0.0;
		final Double Y = 0.0;
		
		Punto centro = new Punto(X, Y);
		
		Circulo circulo = new Circulo(centro, RADIO_MAYOR, RADIO_MENOR);
		
		assertNotNull(circulo);
	}
	
	@Test
	public void queSePuedaCrearUnRectangulo() {
		final Double X_ESQUINA_INFERIOR_IZQUIERDA = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA = 10.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA = 15.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA = 25.0;
		final Double LADO_BASE = 10.0;
		final Double LADO_ALTURA = 15.0;
		
		Punto esquinaInferiorIzquierda = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA, Y_ESQUINA_INFERIOR_IZQUIERDA);
		Punto esquinaSuperiorDerecha = new Punto(X_ESQUINA_SUPERIOR_DERECHA, Y_ESQUINA_SUPERIOR_DERECHA);
		
		Rectangulo rectangulo = new Rectangulo(esquinaInferiorIzquierda, esquinaSuperiorDerecha, LADO_BASE, LADO_ALTURA);
		
		assertNotNull(rectangulo);
	}
	
	@Test
	public void queSePuedaCrearUnCuadrado() {
		final Double X_ESQUINA_INFERIOR_IZQUIERDA = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA = 5.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA = 25.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA = 25.0;
		final Double LADO_BASE = 20.0;
		final Double LADO_ALTURA = 20.0;
		
		Punto esquinaInferiorIzquierda = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA, Y_ESQUINA_INFERIOR_IZQUIERDA);
		Punto esquinaSuperiorDerecha = new Punto(X_ESQUINA_SUPERIOR_DERECHA, Y_ESQUINA_SUPERIOR_DERECHA);
		
		Cuadrado cuadrado = new Cuadrado(esquinaInferiorIzquierda, esquinaSuperiorDerecha, LADO_BASE, LADO_ALTURA);
		
		assertNotNull(cuadrado);
	}
	
	@Test
	public void queSePuedaCompararElAreaDeUnaElipseConElAreaDeUnCirculoSiElAreaDeLaElipseEsMayor() {
		final Double RADIO_MAYOR_ELIPSE = 10.0;
		final Double RADIO_MENOR_ELIPSE = 5.0;
		final Double X_ELIPSE = 0.0;
		final Double Y_ELIPSE = 0.0;
		
		Punto centroElipse = new Punto(X_ELIPSE, Y_ELIPSE);
		
		Elipse elipse = new Elipse(centroElipse, RADIO_MAYOR_ELIPSE, RADIO_MENOR_ELIPSE);
		
		final Double RADIO_MAYOR_CIRCULO = 5.0;
		final Double RADIO_MENOR_CIRCULO = 5.0;
		final Double X_CIRCULO = 0.0;
		final Double Y_CIRCULO = 0.0;
		
		Punto centroCirculo = new Punto(X_CIRCULO, Y_CIRCULO);
		
		Circulo circulo = new Circulo(centroCirculo, RADIO_MAYOR_CIRCULO, RADIO_MENOR_CIRCULO);
		
		final Integer VE = 1;
		
		final Integer VO = elipse.compareTo(circulo);
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaCompararElAreaDeUnaElipseConElAreaDeUnCirculoSiElAreaDeLaElipseEsMenor() {
		final Double RADIO_MAYOR_ELIPSE = 4.0;
		final Double RADIO_MENOR_ELIPSE = 2.0;
		final Double X_ELIPSE = 0.0;
		final Double Y_ELIPSE = 0.0;
		
		Punto centroElipse = new Punto(X_ELIPSE, Y_ELIPSE);
		
		Elipse elipse = new Elipse(centroElipse, RADIO_MAYOR_ELIPSE, RADIO_MENOR_ELIPSE);
		
		final Double RADIO_MAYOR_CIRCULO = 5.0;
		final Double RADIO_MENOR_CIRCULO = 5.0;
		final Double X_CIRCULO = 0.0;
		final Double Y_CIRCULO = 0.0;
		
		Punto centroCirculo = new Punto(X_CIRCULO, Y_CIRCULO);
		
		Circulo circulo = new Circulo(centroCirculo, RADIO_MAYOR_CIRCULO, RADIO_MENOR_CIRCULO);
		
		final Integer VE = -1;
		
		final Integer VO = elipse.compareTo(circulo);
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaCompararElAreaDeUnaElipseConElAreaDeUnCirculoSiSonIguales() {
		final Double RADIO_MAYOR_ELIPSE = 5.0;
		final Double RADIO_MENOR_ELIPSE = 5.0;
		final Double X_ELIPSE = 0.0;
		final Double Y_ELIPSE = 0.0;
		
		Punto centroElipse = new Punto(X_ELIPSE, Y_ELIPSE);
		
		Elipse elipse = new Elipse(centroElipse, RADIO_MAYOR_ELIPSE, RADIO_MENOR_ELIPSE);
		
		final Double RADIO_MAYOR_CIRCULO = 5.0;
		final Double RADIO_MENOR_CIRCULO = 5.0;
		final Double X_CIRCULO = 0.0;
		final Double Y_CIRCULO = 0.0;
		
		Punto centroCirculo = new Punto(X_CIRCULO, Y_CIRCULO);
		
		Circulo circulo = new Circulo(centroCirculo, RADIO_MAYOR_CIRCULO, RADIO_MENOR_CIRCULO);
		
		final Integer VE = 0;
		
		final Integer VO = elipse.compareTo(circulo);
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaCompararElAreaDeUnRectanguloConElAreaDeUnCuadradoSiElAreaDelRectanguloEsMayor() {
		final Double X_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO = 10.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA_RECTANGULO = 15.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA_RECTANGULO = 25.0;
		final Double LADO_BASE_RECTANGULO = 10.0;
		final Double LADO_ALTURA_RECTANGULO = 15.0;
		
		Punto esquinaInferiorIzquierdaRectangulo = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO, Y_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO);
		Punto esquinaSuperiorDerechaRectangulo = new Punto(X_ESQUINA_SUPERIOR_DERECHA_RECTANGULO, Y_ESQUINA_SUPERIOR_DERECHA_RECTANGULO);
		
		Rectangulo rectangulo = new Rectangulo(esquinaInferiorIzquierdaRectangulo, esquinaSuperiorDerechaRectangulo, LADO_BASE_RECTANGULO, LADO_ALTURA_RECTANGULO);
	
		final Double X_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO = 5.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA_CUADRADO = 25.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA_CUADRADO = 25.0;
		final Double LADO_BASE_CUADRADO = 10.0;
		final Double LADO_ALTURA_CUADRADO = 10.0;
		
		Punto esquinaInferiorIzquierdaCuadrado = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO, Y_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO);
		Punto esquinaSuperiorDerechaCuadrado = new Punto(X_ESQUINA_SUPERIOR_DERECHA_CUADRADO, Y_ESQUINA_SUPERIOR_DERECHA_CUADRADO);
		
		Cuadrado cuadrado = new Cuadrado(esquinaInferiorIzquierdaCuadrado, esquinaSuperiorDerechaCuadrado, LADO_BASE_CUADRADO, LADO_ALTURA_CUADRADO);
	
		final Integer VE = 1;
		
		final Integer VO = rectangulo.compareTo(cuadrado);
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaCompararElAreaDeUnRectanguloConElAreaDeUnCuadradoSiElAreaDelRectanguloEsMenor() {
		final Double X_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO = 10.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA_RECTANGULO = 15.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA_RECTANGULO = 25.0;
		final Double LADO_BASE_RECTANGULO = 10.0;
		final Double LADO_ALTURA_RECTANGULO = 5.0;
		
		Punto esquinaInferiorIzquierdaRectangulo = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO, Y_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO);
		Punto esquinaSuperiorDerechaRectangulo = new Punto(X_ESQUINA_SUPERIOR_DERECHA_RECTANGULO, Y_ESQUINA_SUPERIOR_DERECHA_RECTANGULO);
		
		Rectangulo rectangulo = new Rectangulo(esquinaInferiorIzquierdaRectangulo, esquinaSuperiorDerechaRectangulo, LADO_BASE_RECTANGULO, LADO_ALTURA_RECTANGULO);
	
		final Double X_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO = 5.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA_CUADRADO = 25.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA_CUADRADO = 25.0;
		final Double LADO_BASE_CUADRADO = 10.0;
		final Double LADO_ALTURA_CUADRADO = 10.0;
		
		Punto esquinaInferiorIzquierdaCuadrado = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO, Y_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO);
		Punto esquinaSuperiorDerechaCuadrado = new Punto(X_ESQUINA_SUPERIOR_DERECHA_CUADRADO, Y_ESQUINA_SUPERIOR_DERECHA_CUADRADO);
		
		Cuadrado cuadrado = new Cuadrado(esquinaInferiorIzquierdaCuadrado, esquinaSuperiorDerechaCuadrado, LADO_BASE_CUADRADO, LADO_ALTURA_CUADRADO);
	
		final Integer VE = -1;
		
		final Integer VO = rectangulo.compareTo(cuadrado);
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaCompararElAreaDeUnRectanguloConElAreaDeUnCuadradoSiSonIguales() {
		final Double X_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO = 10.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA_RECTANGULO = 15.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA_RECTANGULO = 25.0;
		final Double LADO_BASE_RECTANGULO = 10.0;
		final Double LADO_ALTURA_RECTANGULO = 10.0;
		
		Punto esquinaInferiorIzquierdaRectangulo = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO, Y_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO);
		Punto esquinaSuperiorDerechaRectangulo = new Punto(X_ESQUINA_SUPERIOR_DERECHA_RECTANGULO, Y_ESQUINA_SUPERIOR_DERECHA_RECTANGULO);
		
		Rectangulo rectangulo = new Rectangulo(esquinaInferiorIzquierdaRectangulo, esquinaSuperiorDerechaRectangulo, LADO_BASE_RECTANGULO, LADO_ALTURA_RECTANGULO);
	
		final Double X_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO = 5.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA_CUADRADO = 25.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA_CUADRADO = 25.0;
		final Double LADO_BASE_CUADRADO = 10.0;
		final Double LADO_ALTURA_CUADRADO = 10.0;
		
		Punto esquinaInferiorIzquierdaCuadrado = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO, Y_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO);
		Punto esquinaSuperiorDerechaCuadrado = new Punto(X_ESQUINA_SUPERIOR_DERECHA_CUADRADO, Y_ESQUINA_SUPERIOR_DERECHA_CUADRADO);
		
		Cuadrado cuadrado = new Cuadrado(esquinaInferiorIzquierdaCuadrado, esquinaSuperiorDerechaCuadrado, LADO_BASE_CUADRADO, LADO_ALTURA_CUADRADO);
	
		final Integer VE = 0;
		
		final Integer VO = rectangulo.compareTo(cuadrado);
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaMoverUnaElipse() {
		final Double RADIO_MAYOR = 10.0;
		final Double RADIO_MENOR = 5.0;
		final Double X = 0.0;
		final Double Y = 0.0;
		
		Punto centro = new Punto(X, Y);
		
		Elipse elipse = new Elipse(centro, RADIO_MAYOR, RADIO_MENOR);
		
		final Double DELTA_X = 20.0;
		final Double DELTA_Y = 30.0;
		
		elipse.mover(DELTA_X, DELTA_Y);
		
		final Double VE_X = X + DELTA_X;
		final Double VO_X = elipse.getPosicion().getX();
		
		assertEquals(VE_X, VO_X);
		
		final Double VE_Y = Y + DELTA_Y;
		final Double VO_Y = elipse.getPosicion().getY();
		
		assertEquals(VE_Y, VO_Y);
	}
	
	@Test
	public void queSePuedaMoverUnCirculo() {
		final Double RADIO_MAYOR = 5.0;
		final Double RADIO_MENOR = 5.0;
		final Double X = 0.0;
		final Double Y = 0.0;
		
		Punto centro = new Punto(X, Y);
		
		Circulo circulo = new Circulo(centro, RADIO_MAYOR, RADIO_MENOR);
		
		final Double DELTA_X = 20.0;
		final Double DELTA_Y = 30.0;
		
		circulo.mover(DELTA_X, DELTA_Y);
		
		final Double VE_X = X + DELTA_X;
		final Double VO_X = circulo.getPosicion().getX();
		
		assertEquals(VE_X, VO_X);
		
		final Double VE_Y = Y + DELTA_Y;
		final Double VO_Y = circulo.getPosicion().getY();
		
		assertEquals(VE_Y, VO_Y);
	}
	
	@Test
	public void queSePuedaMoverUnRectangulo() {
		final Double X_ESQUINA_INFERIOR_IZQUIERDA = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA = 10.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA = 15.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA = 25.0;
		final Double LADO_BASE = 10.0;
		final Double LADO_ALTURA = 15.0;
		
		Punto esquinaInferiorIzquierda = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA, Y_ESQUINA_INFERIOR_IZQUIERDA);
		Punto esquinaSuperiorDerecha = new Punto(X_ESQUINA_SUPERIOR_DERECHA, Y_ESQUINA_SUPERIOR_DERECHA);
		
		Rectangulo rectangulo = new Rectangulo(esquinaInferiorIzquierda, esquinaSuperiorDerecha, LADO_BASE, LADO_ALTURA);
		
		final Double DELTA_X = 20.0;
		final Double DELTA_Y = 30.0;
		
		rectangulo.mover(DELTA_X, DELTA_Y);
		
		final Double VE_X_ESQUINA_INFERIOR_IZQUIERDA = X_ESQUINA_INFERIOR_IZQUIERDA + DELTA_X;
		final Double VO_X_ESQUINA_INFERIOR_IZQUIERDA = rectangulo.getPosicion().getX();
		
		assertEquals(VE_X_ESQUINA_INFERIOR_IZQUIERDA, VO_X_ESQUINA_INFERIOR_IZQUIERDA);
		
		final Double VE_Y_ESQUINA_INFERIOR_IZQUIERDA = Y_ESQUINA_INFERIOR_IZQUIERDA + DELTA_Y;
		final Double VO_Y_ESQUINA_INFERIOR_IZQUIERDA = rectangulo.getPosicion().getY();
		
		assertEquals(VE_Y_ESQUINA_INFERIOR_IZQUIERDA, VO_Y_ESQUINA_INFERIOR_IZQUIERDA);
		
		final Double VE_X_ESQUINA_SUPERIOR_DERECHA = X_ESQUINA_SUPERIOR_DERECHA + DELTA_X;
		final Double VO_X_ESQUINA_SUPERIOR_DERECHA = rectangulo.getEsquinaSuperiorDerecha().getX();
		
		assertEquals(VE_X_ESQUINA_SUPERIOR_DERECHA, VO_X_ESQUINA_SUPERIOR_DERECHA);
		
		final Double VE_Y_ESQUINA_SUPERIOR_DERECHA = Y_ESQUINA_SUPERIOR_DERECHA + DELTA_Y;
		final Double VO_Y_ESQUINA_SUPERIOR_DERECHA = rectangulo.getEsquinaSuperiorDerecha().getY();
		
		assertEquals(VE_Y_ESQUINA_SUPERIOR_DERECHA, VO_Y_ESQUINA_SUPERIOR_DERECHA);
	}
	
	@Test
	public void queSePuedaMoverUnCuadrado() {
		final Double X_ESQUINA_INFERIOR_IZQUIERDA = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA = 5.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA = 25.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA = 25.0;
		final Double LADO_BASE = 20.0;
		final Double LADO_ALTURA = 20.0;
		
		Punto esquinaInferiorIzquierda = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA, Y_ESQUINA_INFERIOR_IZQUIERDA);
		Punto esquinaSuperiorDerecha = new Punto(X_ESQUINA_SUPERIOR_DERECHA, Y_ESQUINA_SUPERIOR_DERECHA);
		
		Cuadrado cuadrado = new Cuadrado(esquinaInferiorIzquierda, esquinaSuperiorDerecha, LADO_BASE, LADO_ALTURA);
		
		final Double DELTA_X = 20.0;
		final Double DELTA_Y = 30.0;
		
		cuadrado.mover(DELTA_X, DELTA_Y);
		
		final Double VE_X_ESQUINA_INFERIOR_IZQUIERDA = X_ESQUINA_INFERIOR_IZQUIERDA + DELTA_X;
		final Double VO_X_ESQUINA_INFERIOR_IZQUIERDA = cuadrado.getPosicion().getX();
		
		assertEquals(VE_X_ESQUINA_INFERIOR_IZQUIERDA, VO_X_ESQUINA_INFERIOR_IZQUIERDA);
		
		final Double VE_Y_ESQUINA_INFERIOR_IZQUIERDA = Y_ESQUINA_INFERIOR_IZQUIERDA + DELTA_Y;
		final Double VO_Y_ESQUINA_INFERIOR_IZQUIERDA = cuadrado.getPosicion().getY();
		
		assertEquals(VE_Y_ESQUINA_INFERIOR_IZQUIERDA, VO_Y_ESQUINA_INFERIOR_IZQUIERDA);
		
		final Double VE_X_ESQUINA_SUPERIOR_DERECHA = X_ESQUINA_SUPERIOR_DERECHA + DELTA_X;
		final Double VO_X_ESQUINA_SUPERIOR_DERECHA = cuadrado.getEsquinaSuperiorDerecha().getX();
		
		assertEquals(VE_X_ESQUINA_SUPERIOR_DERECHA, VO_X_ESQUINA_SUPERIOR_DERECHA);
		
		final Double VE_Y_ESQUINA_SUPERIOR_DERECHA = Y_ESQUINA_SUPERIOR_DERECHA + DELTA_Y;
		final Double VO_Y_ESQUINA_SUPERIOR_DERECHA = cuadrado.getEsquinaSuperiorDerecha().getY();
		
		assertEquals(VE_Y_ESQUINA_SUPERIOR_DERECHA, VO_Y_ESQUINA_SUPERIOR_DERECHA);
	}
	
	@Test
	public void queSePuedanCrearYGuardarFigurasEnUnArreglo() {
		List<Figura>listaFiguras = new ArrayList<Figura>();
		
		final Double RADIO_MAYOR_ELIPSE = 10.0;
		final Double RADIO_MENOR_ELIPSE = 5.0;
		final Double X_ELIPSE = 0.0;
		final Double Y_ELIPSE = 0.0;
		
		Punto centroElipse = new Punto(X_ELIPSE, Y_ELIPSE);
		
		Elipse elipse = new Elipse(centroElipse, RADIO_MAYOR_ELIPSE, RADIO_MENOR_ELIPSE);
		
		listaFiguras.add(elipse);
		
		final Double RADIO_MAYOR_CIRCULO = 5.0;
		final Double RADIO_MENOR_CIRCULO = 5.0;
		final Double X_CIRCULO = 0.0;
		final Double Y_CIRCULO = 0.0;
		
		Punto centroCirculo = new Punto(X_CIRCULO, Y_CIRCULO);
		
		Circulo circulo = new Circulo(centroCirculo, RADIO_MAYOR_CIRCULO, RADIO_MENOR_CIRCULO);
		
		listaFiguras.add(circulo);
		
		final Double X_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO = 10.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA_RECTANGULO = 15.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA_RECTANGULO = 25.0;
		final Double LADO_BASE_RECTANGULO = 10.0;
		final Double LADO_ALTURA_RECTANGULO = 15.0;
		
		Punto esquinaInferiorIzquierdaRectangulo = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO, Y_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO);
		Punto esquinaSuperiorDerechaRectangulo = new Punto(X_ESQUINA_SUPERIOR_DERECHA_RECTANGULO, Y_ESQUINA_SUPERIOR_DERECHA_RECTANGULO);
		
		Rectangulo rectangulo = new Rectangulo(esquinaInferiorIzquierdaRectangulo, esquinaSuperiorDerechaRectangulo, LADO_BASE_RECTANGULO, LADO_ALTURA_RECTANGULO);
	
		listaFiguras.add(rectangulo);
		
		final Double X_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO = 5.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA_CUADRADO = 25.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA_CUADRADO = 25.0;
		final Double LADO_BASE_CUADRADO = 10.0;
		final Double LADO_ALTURA_CUADRADO = 10.0;
		
		Punto esquinaInferiorIzquierdaCuadrado = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO, Y_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO);
		Punto esquinaSuperiorDerechaCuadrado = new Punto(X_ESQUINA_SUPERIOR_DERECHA_CUADRADO, Y_ESQUINA_SUPERIOR_DERECHA_CUADRADO);
		
		Cuadrado cuadrado = new Cuadrado(esquinaInferiorIzquierdaCuadrado, esquinaSuperiorDerechaCuadrado, LADO_BASE_CUADRADO, LADO_ALTURA_CUADRADO);
		
		listaFiguras.add(cuadrado);
		
		assertNotNull(listaFiguras);
	}
	
	@Test
	public void queSePuedanCrearYGuardarFigurasEnUnArregloOrdenadasPorArea() {
		List<Figura>listaFiguras = new ArrayList<Figura>();
		
		final Double RADIO_MAYOR_ELIPSE = 10.0;
		final Double RADIO_MENOR_ELIPSE = 5.0;
		final Double X_ELIPSE = 0.0;
		final Double Y_ELIPSE = 0.0;
		
		Punto centroElipse = new Punto(X_ELIPSE, Y_ELIPSE);
		
		Elipse elipse = new Elipse(centroElipse, RADIO_MAYOR_ELIPSE, RADIO_MENOR_ELIPSE);
		
		listaFiguras.add(elipse);
		
		final Double RADIO_MAYOR_CIRCULO = 5.0;
		final Double RADIO_MENOR_CIRCULO = 5.0;
		final Double X_CIRCULO = 0.0;
		final Double Y_CIRCULO = 0.0;
		
		Punto centroCirculo = new Punto(X_CIRCULO, Y_CIRCULO);
		
		Circulo circulo = new Circulo(centroCirculo, RADIO_MAYOR_CIRCULO, RADIO_MENOR_CIRCULO);
		
		listaFiguras.add(circulo);
		
		final Double X_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO = 10.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA_RECTANGULO = 15.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA_RECTANGULO = 25.0;
		final Double LADO_BASE_RECTANGULO = 10.0;
		final Double LADO_ALTURA_RECTANGULO = 15.0;
		
		Punto esquinaInferiorIzquierdaRectangulo = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO, Y_ESQUINA_INFERIOR_IZQUIERDA_RECTANGULO);
		Punto esquinaSuperiorDerechaRectangulo = new Punto(X_ESQUINA_SUPERIOR_DERECHA_RECTANGULO, Y_ESQUINA_SUPERIOR_DERECHA_RECTANGULO);
		
		Rectangulo rectangulo = new Rectangulo(esquinaInferiorIzquierdaRectangulo, esquinaSuperiorDerechaRectangulo, LADO_BASE_RECTANGULO, LADO_ALTURA_RECTANGULO);
	
		listaFiguras.add(rectangulo);
		
		final Double X_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO = 5.0;
		final Double Y_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO = 5.0;
		final Double X_ESQUINA_SUPERIOR_DERECHA_CUADRADO = 25.0;
		final Double Y_ESQUINA_SUPERIOR_DERECHA_CUADRADO = 25.0;
		final Double LADO_BASE_CUADRADO = 10.0;
		final Double LADO_ALTURA_CUADRADO = 10.0;
		
		Punto esquinaInferiorIzquierdaCuadrado = new Punto(X_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO, Y_ESQUINA_INFERIOR_IZQUIERDA_CUADRADO);
		Punto esquinaSuperiorDerechaCuadrado = new Punto(X_ESQUINA_SUPERIOR_DERECHA_CUADRADO, Y_ESQUINA_SUPERIOR_DERECHA_CUADRADO);
		
		Cuadrado cuadrado = new Cuadrado(esquinaInferiorIzquierdaCuadrado, esquinaSuperiorDerechaCuadrado, LADO_BASE_CUADRADO, LADO_ALTURA_CUADRADO);
		
		listaFiguras.add(cuadrado);
		
		Collections.sort((List<Figura>) listaFiguras);
		
		List<Figura>listaFigurasEsperada = new ArrayList<Figura>();
		
		listaFigurasEsperada.add(circulo);
		listaFigurasEsperada.add(cuadrado);
		listaFigurasEsperada.add(rectangulo);
		listaFigurasEsperada.add(elipse);
		
		assertEquals(listaFigurasEsperada, listaFiguras);
	}
	
}

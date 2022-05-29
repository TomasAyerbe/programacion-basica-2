package figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnCirculoConNombre() {
		final String NOMBRE = "Circulo";
		final Double RADIO = 2.50;
		
		Figura figura = new Circulo(NOMBRE, RADIO);
		
		assertNotNull(figura);
	}
		
	@Test
	public void queSePuedaCrearUnCirculoConNombreYColor() {
		final String NOMBRE = "Circulo";
		final String COLOR = "Rojo";
		final Double RADIO = 2.50;
		
		Figura figura = new Circulo(NOMBRE, COLOR, RADIO);
		
		assertNotNull(figura);
	}
	
	@Test
	public void queSePuedaCrearUnTrianguloConNombre() {
		final String NOMBRE = "Triangulo";
		final Double BASE = 1.70;
		final Double ALTURA = 3.15;
		
		Figura figura = new Triangulo(NOMBRE, BASE, ALTURA);
		
		assertNotNull(figura);
	}
	
	@Test
	public void queSePuedaCrearUnTrianguloConNombreYColor() {
		final String NOMBRE = "Triangulo";
		final String COLOR = "Verde";
		final Double BASE = 1.70;
		final Double ALTURA = 3.15;
		
		Figura figura = new Triangulo(NOMBRE, COLOR, BASE, ALTURA);
		
		assertNotNull(figura);
	}
	
	@Test
	public void queSePuedaCrearUnCuadradoConNombre() {
		final String NOMBRE = "Cuadrado";
		final Double LADO = 5.0;
		
		Figura figura = new Cuadrado(NOMBRE, LADO);
		
		assertNotNull(figura);
	}
	
	@Test
	public void queSePuedaCrearUnCuadradoConNombreYColor() {
		final String NOMBRE = "Cuadrado";
		final String COLOR = "Azul";
		final Double LADO = 5.0;
		
		Figura figura = new Cuadrado(NOMBRE, COLOR, LADO);
		
		assertNotNull(figura);
	}
	
	@Test
	public void queSePuedaCalcularElAreaDeUnCirculo() {
		final String NOMBRE = "Circulo";
		final String COLOR = "Rojo";
		final Double RADIO = 2.50;
		
		Figura figura = new Circulo(NOMBRE, COLOR, RADIO);
		
		final Double VE = (3.14159 * (RADIO * RADIO));
		
		final Double VO = figura.calcularArea();
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaCalcularElAreaDeUnTriangulo() {
		final String NOMBRE = "Triangulo";
		final String COLOR = "Verde";
		final Double BASE = 1.70;
		final Double ALTURA = 3.15;
		
		Figura figura = new Triangulo(NOMBRE, COLOR, BASE, ALTURA);
		
		final Double VE = ((BASE * ALTURA) / 2);
		
		final Double VO = figura.calcularArea();
		
		assertEquals(VE, VO);
	}

	@Test
	public void queSePuedaCalcularElAreaDeUnCuadrado() {
		final String NOMBRE = "Cuadrado";
		final String COLOR = "Azul";
		final Double LADO = 5.0;
		
		Figura figura = new Cuadrado(NOMBRE, COLOR, LADO);
		
		final Double VE = (LADO * LADO);
		
		final Double VO = figura.calcularArea();
		
		assertEquals(VE, VO);
	}

	@Test
	public void queSePuedaCalcularElAreaDeUnCirculoUsandoPolimorfismo() {
		final String NOMBRE = "Circulo";
		final Double RADIO = 2.50;
		
		Figura figura = new Circulo(NOMBRE, RADIO);
		
		final Double VE = (3.14159 * (RADIO * RADIO));
		
		CalculoArea calcArea = new CalculoArea();
		
		final Double VO = calcArea.returnArea(figura);
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaCalcularElAreaDeUnTrianguloUsandoPolimorfismo() {
		final String NOMBRE = "Triangulo";
		final Double BASE = 1.70;
		final Double ALTURA = 3.15;
		
		Figura figura = new Triangulo(NOMBRE, BASE, ALTURA);
		
		final Double VE = ((BASE * ALTURA) / 2);
		
		CalculoArea calcArea = new CalculoArea();
		
		final Double VO = calcArea.returnArea(figura);
		
		assertEquals(VE, VO);
	}
	
	@Test
	public void queSePuedaCalcularElAreaDeUnCuadradoUsandoPolimorfismo() {
		final String NOMBRE = "Cuadrado";
		final Double LADO = 5.0;
		
		Figura figura = new Cuadrado(NOMBRE, LADO);
		
		final Double VE = (LADO * LADO);
		
		CalculoArea calcArea = new CalculoArea();
		
		final Double VO = calcArea.returnArea(figura);
		
		assertEquals(VE, VO);
	}
	
}

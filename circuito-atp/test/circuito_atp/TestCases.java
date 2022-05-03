package circuito_atp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnCircuito() {
		String nombreCircuito = "ATP";
		
		Circuito atp = new Circuito(nombreCircuito);
		
		assertNotNull(atp);
	}

	@Test
	public void queSePuedaAgregarUnJugadorAlRanking() {
		String nombreCircuito = "ATP";
		
		Circuito atp = new Circuito(nombreCircuito);
		
		String nombre = "Novak Djokovic";
		Integer edad = 34;
		Double altura = 1.88;
		Double peso = 77.0;
		String pais = "Serbia";
		Integer ranking = 1;
		Integer puntos = 8400;
	 	Integer titulos = 86;
		
		atp.agregarJugador(nombre, edad, altura, peso, pais, ranking, puntos, titulos);
		
		assertNotNull(atp.getRankingJugadores());
	}
	
	@Test
	public void queSePuedanSumarPuntosAUnJugador() {
		String nombreCircuito = "ATP";
		
		Circuito atp = new Circuito(nombreCircuito);
		
		String nombre = "Daniil Medvedev";
		Integer edad = 26;
		Double altura = 1.98;
		Double peso = 83.0;
		String pais = "Rusia";
		Integer ranking = 2;
		Integer puntos = 8080;
	 	Integer titulos = 13;
		
		atp.agregarJugador(nombre, edad, altura, peso, pais, ranking, puntos, titulos);
				
		Integer puntosASumar = 2000;
		
		Integer ve = atp.getRankingJugadores().get(0).getPuntos() + puntosASumar;
		
		atp.sumarPuntos(puntos, puntosASumar);
		
		assertEquals(ve, atp.getRankingJugadores().get(0).getPuntos());
	}
	
	@Test
	public void queSePuedanRestarPuntosAUnJugador() { 
		String nombreCircuito = "ATP";
		
		Circuito atp = new Circuito(nombreCircuito);
		
		String nombre = "Rafael Nadal";
		Integer edad = 35;
		Double altura = 1.85;
		Double peso = 85.0;
		String pais = "España";
		Integer ranking = 3;
		Integer puntos = 6435;
	 	Integer titulos = 91;
		
		atp.agregarJugador(nombre, edad, altura, peso, pais, ranking, puntos, titulos);
		
		Integer puntosARestar = 800;
		
		Integer ve = atp.getRankingJugadores().get(0).getPuntos() - puntosARestar;
		
		atp.restarPuntos(puntos, puntosARestar);
		
		assertEquals(ve, atp.getRankingJugadores().get(0).getPuntos());
	}
	
	@Test
	public void queSePuedaVerRankingDeJugadores() {
		String nombreCircuito = "ATP";
		
		Circuito atp = new Circuito(nombreCircuito);
		
		String nombre = "Novak Djokovic";
		Integer edad = 34;
		Double altura = 1.88;
		Double peso = 77.0;
		String pais = "Serbia";
		Integer ranking = 1;
		Integer puntos = 8400;
	 	Integer titulos = 86;
		
		atp.agregarJugador(nombre, edad, altura, peso, pais, ranking, puntos, titulos);
		
		String nombre1 = "Daniil Medvedev";
		Integer edad1 = 26;
		Double altura1 = 1.98;
		Double peso1 = 83.0;
		String pais1 = "Rusia";
		Integer ranking1 = 2;
		Integer puntos1 = 8080;
	 	Integer titulos1 = 13;
		
		atp.agregarJugador(nombre1, edad1, altura1, peso1, pais1, ranking1, puntos1, titulos1);
		
		String nombre2 = "Rafael Nadal";
		Integer edad2 = 35;
		Double altura2 = 1.85;
		Double peso2 = 85.0;
		String pais2 = "España";
		Integer ranking2 = 3;
		Integer puntos2 = 6435;
	 	Integer titulos2 = 91;
		
	 	atp.agregarJugador(nombre2, edad2, altura2, peso2, pais2, ranking2, puntos2, titulos2);
		
		assertNotNull(atp.getRankingJugadores());
	}
	
	@Test
	public void queUnJugadorPuedaSubirUnPuesto() {
		String nombreCircuito = "ATP";
		
		Circuito atp = new Circuito(nombreCircuito);
		
		String nombre = "Novak Djokovic";
		Integer edad = 34;
		Double altura = 1.88;
		Double peso = 77.0;
		String pais = "Serbia";
		Integer ranking = 1;
		Integer puntos = 8400;
	 	Integer titulos = 86;
		
		atp.agregarJugador(nombre, edad, altura, peso, pais, ranking, puntos, titulos);
		
		String nombre1 = "Daniil Medvedev";
		Integer edad1 = 26;
		Double altura1 = 1.98;
		Double peso1 = 83.0;
		String pais1 = "Rusia";
		Integer ranking1 = 2;
		Integer puntos1 = 8080;
	 	Integer titulos1 = 13;
		
		atp.agregarJugador(nombre1, edad1, altura1, peso1, pais1, ranking1, puntos1, titulos1);
		
		String nombre2 = "Rafael Nadal";
		Integer edad2 = 35;
		Double altura2 = 1.85;
		Double peso2 = 85.0;
		String pais2 = "España";
		Integer ranking2 = 3;
		Integer puntos2 = 6435;
	 	Integer titulos2 = 91;
		
	 	atp.agregarJugador(nombre2, edad2, altura2, peso2, pais2, ranking2, puntos2, titulos2);
	 	
	 	Integer ve = atp.getRankingJugadores().get(1).getRanking() - 1;
	 	
		atp.subirPuesto(ranking1);
		
		assertNotEquals(ve, atp.getRankingJugadores().get(1).getRanking());
	}
	
	@Test
	public void queUnJugadorPuedaBajarUnPuesto() {
		String nombreCircuito = "ATP";
		
		Circuito atp = new Circuito(nombreCircuito);
		
		String nombre = "Novak Djokovic";
		Integer edad = 34;
		Double altura = 1.88;
		Double peso = 77.0;
		String pais = "Serbia";
		Integer ranking = 1;
		Integer puntos = 8400;
	 	Integer titulos = 86;
		
		atp.agregarJugador(nombre, edad, altura, peso, pais, ranking, puntos, titulos);
		
		String nombre1 = "Daniil Medvedev";
		Integer edad1 = 26;
		Double altura1 = 1.98;
		Double peso1 = 83.0;
		String pais1 = "Rusia";
		Integer ranking1 = 2;
		Integer puntos1 = 8080;
	 	Integer titulos1 = 13;
		
		atp.agregarJugador(nombre1, edad1, altura1, peso1, pais1, ranking1, puntos1, titulos1);
		
		String nombre2 = "Rafael Nadal";
		Integer edad2 = 35;
		Double altura2 = 1.85;
		Double peso2 = 85.0;
		String pais2 = "España";
		Integer ranking2 = 3;
		Integer puntos2 = 6435;
	 	Integer titulos2 = 91;
		
	 	atp.agregarJugador(nombre2, edad2, altura2, peso2, pais2, ranking2, puntos2, titulos2);
	 	
	 	Integer ve = atp.getRankingJugadores().get(1).getRanking() + 1;
	 	
		atp.bajarPuesto(ranking1);
		
		assertNotEquals(ve, atp.getRankingJugadores().get(1).getRanking());
	}
	
	@Test
	public void queUnJugadorPuedaCumplirAnos() {
		String nombreCircuito = "ATP";
		
		Circuito atp = new Circuito(nombreCircuito);
		
		String nombre = "Novak Djokovic";
		Integer edad = 34;
		Double altura = 1.88;
		Double peso = 77.0;
		String pais = "Serbia";
		Integer ranking = 1;
		Integer puntos = 8400;
	 	Integer titulos = 86;
		
		atp.agregarJugador(nombre, edad, altura, peso, pais, ranking, puntos, titulos);
		
		Integer ve = atp.getRankingJugadores().get(0).getEdad() + 1;
		
		atp.cumplirAnios(ranking);
		
		assertEquals(ve, atp.getRankingJugadores().get(0).getEdad());
	}
	
	@Test
	public void queUnJugadorPuedaGanarUnTitulo() {
		String nombreCircuito = "ATP";
		
		Circuito atp = new Circuito(nombreCircuito);
		
		String nombre = "Novak Djokovic";
		Integer edad = 34;
		Double altura = 1.88;
		Double peso = 77.0;
		String pais = "Serbia";
		Integer ranking = 1;
		Integer puntos = 8400;
	 	Integer titulos = 86;
		
		atp.agregarJugador(nombre, edad, altura, peso, pais, ranking, puntos, titulos);
		
		Integer ve = atp.getRankingJugadores().get(0).getTitulos() + 1;
		
		atp.ganarTitulo(ranking);
		
		assertEquals(ve, atp.getRankingJugadores().get(0).getTitulos());
	}
	
}

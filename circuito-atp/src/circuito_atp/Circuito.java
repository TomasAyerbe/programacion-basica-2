package circuito_atp;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Circuito {

	private String nombre;
	private List<Jugador>rankingJugadores = new ArrayList<Jugador>();
	
	
	public Circuito (String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarJugador(String nombre, Integer edad, Double altura, Double peso ,String pais, Integer ranking, Integer puntos, Integer titulos) {
		Jugador jugador = new Jugador(nombre, edad, altura, peso, pais, ranking, puntos, titulos);
		this.rankingJugadores.add(jugador);
	}
	
	public List<Jugador> getRankingJugadores() {
		return rankingJugadores;
	}
	
	public void sumarPuntos(Integer puntos, Integer puntosASumar) {
		for(int i=0; i<this.rankingJugadores.size(); i++) {
			if(this.rankingJugadores.get(i).getPuntos().equals(puntos)) {
				rankingJugadores.get(i).setPuntos(puntos + puntosASumar);
			}
		}
	}
	
	public void restarPuntos(Integer puntos, Integer puntosARestar) {
		for(int i=0; i<this.rankingJugadores.size(); i++) {
			if(this.rankingJugadores.get(i).getPuntos().equals(puntos)) {
				rankingJugadores.get(i).setPuntos(puntos - puntosARestar);
			}
		}
	}
	
	public void subirPuesto(Integer ranking) {
		for(int i=0; i<this.rankingJugadores.size(); i++) {
			if(this.rankingJugadores.get(i).getRanking().equals(ranking)) {
				rankingJugadores.get(i).setRanking(ranking-1);
				rankingJugadores.get(i-1).setRanking(ranking);
				Collections.swap(rankingJugadores, i, i-1);
			}
		}
	}
	
	public void bajarPuesto(Integer ranking) {
		for(int i=0; i<this.rankingJugadores.size(); i++) {
			if(this.rankingJugadores.get(i).getRanking().equals(ranking)) {
				rankingJugadores.get(i).setRanking(ranking+1);
				rankingJugadores.get(i+1).setRanking(ranking);
				Collections.swap(rankingJugadores, i, i+1);
			}
		}
	}
	
	public void cumplirAnios(Integer ranking) {
		for(int i=0; i<this.rankingJugadores.size(); i++) {
			if(this.rankingJugadores.get(i).getRanking().equals(ranking)) {
				rankingJugadores.get(i).setEdad(rankingJugadores.get(i).getEdad() + 1);
			}
		}
	}

	public void ganarTitulo(Integer ranking) {
		for(int i=0; i<this.rankingJugadores.size(); i++) {
			if(this.rankingJugadores.get(i).getRanking().equals(ranking)) {
				rankingJugadores.get(i).setTitulos(rankingJugadores.get(i).getTitulos() + 1);
			}
		}
	}
	
}
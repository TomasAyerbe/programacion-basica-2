package circuito_atp;

public class Jugador {
	
	private String nombre;
	private Integer edad;
	private Double altura;
	private Double peso;
	private String pais;
	private Integer ranking;
	private Integer puntos;
	private Integer titulos;
	
	public Jugador (String nombre, Integer edad, Double altura, Double peso ,String pais, Integer ranking, Integer puntos, Integer titulos) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.pais = pais;
		this.ranking = ranking;
		this.puntos = puntos;
		this.titulos = titulos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public Integer getRanking() {
		return ranking;
	}
	
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	
	public Integer getPuntos() {
		return puntos;
	}
	
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	
	public Integer getTitulos() {
		return titulos;
	}
	
	public void setTitulos(Integer titulos) {
		this.titulos = titulos;
	}

}

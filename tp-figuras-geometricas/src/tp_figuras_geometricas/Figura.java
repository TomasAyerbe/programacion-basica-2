package tp_figuras_geometricas;

public abstract class Figura implements Comparable<Figura>, Movible  {
	
	private Punto posicion;
	private Double ladoRadioMayor;
	private Double ladoRadioMenor;
	
	public Figura (Punto punto, Double ladoRadioMayor, Double ladoRadioMenor) {
		this.posicion = punto;
		this.setLadoRadioMayor(ladoRadioMayor);
		this.setLadoRadioMenor(ladoRadioMenor); 
	}
	
	public abstract Double calcularArea();

	public Punto getPosicion() {
		return posicion;
	}
	
	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
	
	public Double getLadoRadioMayor() {
		return ladoRadioMayor;
	}

	public void setLadoRadioMayor(Double ladoRadioMayor) {
		this.ladoRadioMayor = ladoRadioMayor;
	}
	
	public Double getLadoRadioMenor() {
		return ladoRadioMenor;
	}

	public void setLadoRadioMenor(Double ladoRadioMenor) {
		this.ladoRadioMenor = ladoRadioMenor;
	}
	
	@Override
	public int compareTo(Figura figura) {
		int resultado = 0;
		
		if (this.calcularArea() < figura.calcularArea()) {
			resultado = -1;
		} else if (this.calcularArea() > figura.calcularArea()) {
			resultado = 1;
		}
		
		return resultado;
	}
	
	@Override
	public void mover(Double deltaX, Double deltaY) {
		Punto punto = getPosicion();
		punto.setX(punto.getX() + deltaX);
		punto.setY(punto.getY() + deltaY);
		setPosicion(punto);
	}
	
}

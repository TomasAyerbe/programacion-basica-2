package unlam.ascensor;

public class Ascensor {

	private Double pesoMaximo;
	private Integer cantidadPersonasMaximas;
	private Integer pisoMaximo;
	private Integer pisoMinimo;
	private Integer pisoActual;
	private Boolean condicionPuerta;

	public Ascensor(Double pesoMaximo, Integer cantidadPersonasMaximas, Integer pisoMaximo, Integer pisoMinimo) {
		this.pesoMaximo = pesoMaximo;
		this.cantidadPersonasMaximas = cantidadPersonasMaximas;
		this.pisoMaximo = pisoMaximo;
		this.pisoMinimo = pisoMinimo;
		this.pisoActual = 0;
	}

	public Integer irAPiso(Integer pisoDestino) {
		this.pisoActual = pisoDestino;
		
		return null;
	}
	
	public void setPisoActual(Integer pisoActual) {
		this.pisoActual = pisoActual;
	}

	public Integer getPisoActual() {
		return pisoActual;
	}

	public void comprobarEIrAPisoMaximo(Integer pisoDestino, Integer pisoActual) {
		if (pisoDestino > pisoMaximo) {
			setPisoActual(pisoActual);
		} else {
			irAPiso(pisoDestino);	
		}
	}

	public void comprobarEIrAPisoMinimo(Integer pisoDestino, Integer pisoActual) {
		if (pisoDestino < pisoMinimo) {
			setPisoActual(pisoActual);
		} else {
			irAPiso(pisoDestino);	
		}
	}

	public Boolean estaAbierta(Double pesoAscensorActual, Integer cantidadPersonasActual) {
		if ((pesoAscensorActual > pesoMaximo) || (cantidadPersonasActual > cantidadPersonasMaximas)) {
			condicionPuerta = true;
		} else {
			condicionPuerta = false;
		}
		
		return condicionPuerta;
	}
	
	public Boolean estaCerrada(Double pesoAscensorActual, Integer cantidadPersonasActual) {
		if ((pesoAscensorActual > pesoMaximo) || (cantidadPersonasActual > cantidadPersonasMaximas)) {
			condicionPuerta = false;
		} else {
			condicionPuerta = true;
		}
		
		return condicionPuerta;
	}
	
}

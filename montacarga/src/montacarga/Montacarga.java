package montacarga;

import java.util.ArrayList;

public class Montacarga {
	
	private Double pesoMaximo;
	private ArrayList<Carga> cargas = new ArrayList<Carga>();
	
	public Montacarga (Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Boolean agregarCarga(Carga c) {
		return cargas.add(c);
	}

	public Integer obtenerCantidadDeCargas() {
		return cargas.size();
	}
	
	public Double obtenerPesoCargado() {
		Double pesoCargado = 0.0;
		
		for (Carga carga : this.cargas) {
			pesoCargado += carga.getPeso();
		}
		
		return pesoCargado;
	}

	public Boolean comprobarQueNoSuperePeso(Double pesoMaximo, Double pesoParaAgregar) {
		Boolean sePuedeAgregar;
		
		if (pesoParaAgregar <= pesoMaximo) {
			sePuedeAgregar = true;
		} else {
			sePuedeAgregar = false;
		}
		
		return sePuedeAgregar;
	}

	public Double registrarCargaAContadorHistorico() {
		Double contadorHistoricoCargas = 0.0;
		
		for (Carga carga : this.cargas) {
			contadorHistoricoCargas += carga.getPeso();
		}
		
		return contadorHistoricoCargas;
	}
	
	public Boolean vaciarCarga(Carga c) {
		return cargas.remove(c);
	}
	
}

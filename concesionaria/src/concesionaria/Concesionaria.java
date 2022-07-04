package concesionaria;

import java.util.ArrayList;
import java.util.List;

public class Concesionaria {

	private List<Auto> autos = new ArrayList<Auto>();
			
	public void agregarAuto(Auto auto) {
		autos.add(auto);
	}
	
	public List<Auto> getAutos() {
		return autos;
	}

	public Auto buscarPorPatente(String patente) throws AutoNoEncontradoException {
		for (Auto auto: autos) {
			if (auto.getPatenteAuto().equals(patente)) {
				return auto;
			}
		}
		
		throw new AutoNoEncontradoException("No se ha encontrado el auto con patente " + patente + ".");
	}
	
	public Boolean buscarDuplicado(String patente) throws AutoDuplicadoException {
		for (Auto auto: autos) {
			if (!auto.getPatenteAuto().equals(patente)) {
				return false;
			}
		}
	
		throw new AutoDuplicadoException("Existe un auto con patente " + patente + ".");
	}
	
	public Boolean validarPatente(String patente) throws PatenteNoValidaException {
		if ((patente.toUpperCase().charAt(0) >= 'A' && patente.toUpperCase().charAt(0) <= 'Z') && (patente.toUpperCase().charAt(1) >= 'A' && patente.toUpperCase().charAt(1) <= 'Z')) {
			return false;
		}
		
		throw new PatenteNoValidaException("La patente " + patente + " no es válida.");
	}
	
}

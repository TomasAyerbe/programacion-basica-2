package veterinaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Veterinaria {

	private String nombreVeterinaria;

	private Map<Integer, Dueno> duenos = new HashMap<Integer, Dueno>();
	private List<Atencion> atenciones = new ArrayList<Atencion>();
	
	public Veterinaria (String nombreVeterinaria) {
		this.nombreVeterinaria = nombreVeterinaria;
	}

	public String getNombreVeterinaria() {
		return nombreVeterinaria;
	}

	public void setNombreVeterinaria(String nombreVeterinaria) {
		this.nombreVeterinaria = nombreVeterinaria;
	}

	public void agregarDueno(Dueno dueno) {
		duenos.put(dueno.getDniDueno(), dueno);
	}
	
	public Map<Integer, Dueno> getDuenos() {
		return duenos;
	}
	
	public void agregarAtencion(Atencion atencion) throws DuenioInexistenteException, MascotaNoEncontradaException {
		if (!duenos.containsKey(atencion.getDniDueno())) {
			throw new DuenioInexistenteException("No existe el dueño con DNI " + atencion.getDniDueno() + ".");
		} else if (!duenos.get(atencion.getDniDueno()).getMascotas().containsKey(atencion.getIdMascota())) {
			throw new MascotaNoEncontradaException("No se encontró la mascota con ID " + atencion.getIdMascota() + ".");
		}
		
		atenciones.add(atencion);
	}
	
	public List<Atencion> getAtenciones() {
		return atenciones;
	}
	
	public Map<Integer, Integer> obtenerMapaConIdAtencionYIdMascota() {
		Map<Integer, Integer> mapaIdAtencionIdMascota = new HashMap<Integer, Integer>();
		
		for (Atencion atencion: atenciones) {
			mapaIdAtencionIdMascota.put(atencion.getIdAtencion(), atencion.getIdMascota());
		}
		
		return mapaIdAtencionIdMascota;
	}
	
}

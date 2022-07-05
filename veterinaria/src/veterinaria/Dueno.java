package veterinaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dueno {

	private String nombreDueno;
	private Integer dniDueno;

	private Map<Integer, Mascota> mascotas = new HashMap<Integer, Mascota>();
	
	public Dueno (Integer dniDueno, String nombreDueno) {
		this.dniDueno = dniDueno;
		this.nombreDueno = nombreDueno;
	}

	public Integer getDniDueno() {
		return dniDueno;
	}

	public void setDniDueno(Integer dniDueno) {
		this.dniDueno = dniDueno;
	}
	
	public String getNombreDueno() {
		return nombreDueno;
	}

	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}

	public void agregarMascota(Mascota mascota) throws MascotaDuplicadaException {
		if (mascotas.containsKey(mascota.getIdMascota())) {
			throw new MascotaDuplicadaException("Mascota duplicada.");
		}
		
		mascotas.put(mascota.getIdMascota(), mascota);
	}
	
	public Map<Integer, Mascota> getMascotas() {
		return mascotas;
	}

	public List<Mascota> obtenerListaMascotasDomesticasOrdenadasPorApodo() {
		List<Mascota> mascotasOrdenadas = new ArrayList<Mascota>(mascotas.values());
		
		Collections.sort(mascotasOrdenadas, new ApodoMascotaComparator());
		
		return mascotasOrdenadas;
	}
	
}

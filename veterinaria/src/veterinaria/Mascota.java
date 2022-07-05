package veterinaria;

public class Mascota {
	
	private Integer idMascota;
	private String nombreMascota;
	private String apodoMascota;
	private Boolean mascotaDomestica;

	public Mascota (Integer idMascota, String nombreMascota, String apodoMascota, Boolean mascotaDomestica) {
		this.idMascota = idMascota;
		this.nombreMascota = nombreMascota;
		this.apodoMascota = apodoMascota;
		this.mascotaDomestica = mascotaDomestica;
	}

	public Integer getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Integer idMascota) {
		this.idMascota = idMascota;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getApodoMascota() {
		return apodoMascota;
	}

	public void setApodoMascota(String apodoMascota) {
		this.apodoMascota = apodoMascota;
	}

	public Boolean getMascotaDomestica() {
		return mascotaDomestica;
	}

	public void setMascotaDomestica(Boolean mascotaDomestica) {
		this.mascotaDomestica = mascotaDomestica;
	}
	
}

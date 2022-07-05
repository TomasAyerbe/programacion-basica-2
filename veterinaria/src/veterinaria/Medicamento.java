package veterinaria;

public class Medicamento {
	
	private Integer idMedicamento;
	private String descripcionMedicamento;
	private Double precioMedicamento;
	private Integer idAtencion;
	
	public Medicamento (Integer idMedicamento, String descripcionMedicamento, Double precioMedicamento) {
		this.idMedicamento = idMedicamento;
		this.descripcionMedicamento = descripcionMedicamento;
		this.precioMedicamento = precioMedicamento;
	}
	
	public Medicamento (Integer idAtencion, Integer idMedicamento, String descripcionMedicamento, Double precioMedicamento) {
		this.idAtencion = idAtencion;
		this.idMedicamento = idMedicamento;
		this.descripcionMedicamento = descripcionMedicamento;
		this.precioMedicamento = precioMedicamento;
	}

	public Integer getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(Integer idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getDescripcionMedicamento() {
		return descripcionMedicamento;
	}

	public void setDescripcionMedicamento(String descripcionMedicamento) {
		this.descripcionMedicamento = descripcionMedicamento;
	}

	public Double getPrecioMedicamento() {
		return precioMedicamento;
	}

	public void setPrecioMedicamento(Double precioMedicamento) {
		this.precioMedicamento = precioMedicamento;
	}

	public Integer getIdAtencion() {
		return idAtencion;
	}

	public void setIdAtencion(Integer idAtencion) {
		this.idAtencion = idAtencion;
	}
	
}

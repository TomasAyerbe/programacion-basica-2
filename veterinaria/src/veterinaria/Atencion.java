package veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Atencion {
	
	private Integer dniDueno;
	private Integer idMascota;
	private Double precioAtencion;
	private Integer idAtencion;
	
	private List<Medicamento> medicamentos = new ArrayList<Medicamento>();
	
	public Atencion (Integer dniDueno, Integer idMascota, Double precioAtencion) {
		this.dniDueno = dniDueno;
		this.idMascota = idMascota;
		this.precioAtencion = precioAtencion;
	}
	
	public Atencion (Integer idAtencion, Integer dniDueno, Integer idMascota, Double precioAtencion) {
		this.idAtencion = idAtencion;
		this.dniDueno = dniDueno;
		this.idMascota = idMascota;
		this.precioAtencion = precioAtencion;
	}

	public Integer getDniDueno() {
		return dniDueno;
	}

	public void setDniDueno(Integer dniDueno) {
		this.dniDueno = dniDueno;
	}

	public Integer getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Integer idMascota) {
		this.idMascota = idMascota;
	}

	public Double getPrecioAtencion() {
		return precioAtencion;
	}

	public void setPrecioAtencion(Double precioAtencion) {
		this.precioAtencion = precioAtencion;
	}

	public Integer getIdAtencion() {
		return idAtencion;
	}

	public void setIdAtencion(Integer idAtencion) {
		this.idAtencion = idAtencion;
	}

	public void asignarMedicamento(Medicamento medicamento) {
		medicamentos.add(medicamento);
	}
	
	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public Double calcularPrecioTotal() {
		Double precio = getPrecioAtencion();
		
		for (Medicamento medicamento: medicamentos) {
			precio += medicamento.getPrecioMedicamento();
		}
		
		return precio;
	}
	
}

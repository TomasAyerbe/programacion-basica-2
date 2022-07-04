package concesionaria;

public class Auto {

	private String marcaAuto;
	private String patenteAuto;

	public Auto (String marcaAuto, String patenteAuto) {
		this.marcaAuto = marcaAuto;
		this.patenteAuto = patenteAuto;
	}

	protected String getMarcaAuto() {
		return marcaAuto;
	}

	protected void setMarcaAuto(String marcaAuto) {
		this.marcaAuto = marcaAuto;
	}
	
	protected String getPatenteAuto() {
		return patenteAuto;
	}

	protected void setpatenteAuto(String patenteAuto) {
		this.patenteAuto = patenteAuto;
	}
	
}

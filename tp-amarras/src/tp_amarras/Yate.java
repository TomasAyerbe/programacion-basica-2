package tp_amarras;

public abstract class Yate {

	protected String nombre;
	protected String duenio;
	protected Double manga;
	protected Double calado;
	protected Double eslora;
	protected Integer tripulacion;
	protected Double peso;

	public Yate (String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion, Double peso) {
		this.nombre = nombre;
		this.duenio = duenio;
		this.manga = manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}

	public Double getEslora() {
		return this.eslora;
	}
	
	protected abstract Double getPrecioAmarre();

}

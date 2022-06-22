package tp_amarras;

public class Vela extends Yate {

	protected Double alturaMastil;
	protected Double superficieVelicaMayor;
	protected Double superficieTotal;

	public Vela (String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion, Double peso, Double alturaMastil, Double superficieVelicaMayor, Double superficieTotal) {
		super (nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.alturaMastil = alturaMastil;
		this.superficieVelicaMayor = superficieVelicaMayor;
		this.superficieTotal = superficieTotal;
	}
	
	@Override
	protected Double getPrecioAmarre() {
		Double precioAmarre = 9000.0;
		
		if(getEslora() <= 20.0) {
			precioAmarre += 2000.0;
		} else {
			precioAmarre += 3000.0;
		}
		
		return precioAmarre;
	}
	
}

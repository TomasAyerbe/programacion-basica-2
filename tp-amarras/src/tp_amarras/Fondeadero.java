package tp_amarras;

import java.util.HashSet;
import java.util.Set;

public class Fondeadero {

	private Integer maximoMarras;

	private Set<Yate> amarras = new HashSet<Yate>();
	
	public Fondeadero(Integer maximoMarras) {
		this.maximoMarras=maximoMarras;
	}
	
	public void amarrarYate(Yate yate) {
		amarras.add(yate);
	}

	public void desamarrarYate(Yate yate) {
		amarras.remove(yate);
	}

	public Set<Yate> getAmarras() {
		return amarras;
	}

	public Integer getAmarrasLibres() {
		return (maximoMarras - amarras.size());
	}

	public Double getRecaudacionTotal() {
		Double recaudacionTotal = 0.0;
		
		for (Yate yate : amarras) {
			recaudacionTotal += yate.getPrecioAmarre();
		}
		
		return recaudacionTotal;
	}

}

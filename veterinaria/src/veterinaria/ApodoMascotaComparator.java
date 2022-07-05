package veterinaria;

import java.util.Comparator;

public class ApodoMascotaComparator implements Comparator<Mascota> {

	@Override
	public int compare(Mascota m1, Mascota m2) {
		return m1.getApodoMascota().compareTo(m2.getApodoMascota());
	}

}

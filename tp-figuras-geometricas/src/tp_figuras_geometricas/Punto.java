package tp_figuras_geometricas;

public class Punto {
	
	private Double x;
	private Double y;

	public Punto (Double x, Double y) {
		this.setX(x);
		this.setY(y);
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
	
}

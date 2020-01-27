package cl.earthquake.test.sismos.dto;

public class Coordinates {
	
	private Double x;
	private Double y;
	private Double z;
	
	public Coordinates() {}

	public Coordinates(Double x, Double y, Double z) {
		this.x = x;
		this.y = y;
		this.z = z;
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

	public Double getZ() {
		return z;
	}

	public void setZ(Double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Coordinates [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	

}

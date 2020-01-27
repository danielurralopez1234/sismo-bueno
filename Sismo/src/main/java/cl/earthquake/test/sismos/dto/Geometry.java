package cl.earthquake.test.sismos.dto;

public class Geometry {
	
	private String type;
	private Coordinates coordinates;
	
	public Geometry() {}

	public Geometry(String type, Coordinates coordinates) {
		this.type = type;
		this.coordinates = coordinates;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public String toString() {
		return "Geometry [type=" + type + "]";
	}
	
	
	
	

}

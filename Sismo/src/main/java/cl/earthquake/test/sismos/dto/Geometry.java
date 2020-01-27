package cl.earthquake.test.sismos.dto;

public class Geometry {
	
	private String type;
	private String[] coordinates;
	
	public Geometry() {}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Geometry [type=" + type + "]";
	}
	
	
	
	

}

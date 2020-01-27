package cl.earthquake.test.sismos.dto;

public class SismoMagnitud {
	
	private Double minMagnitude;
	private Double maxMagnitude;
	
	public SismoMagnitud() {}

	public SismoMagnitud(Double minMagnitude, Double maxMagnitude) {
		this.minMagnitude = minMagnitude;
		this.maxMagnitude = maxMagnitude;
	}

	public Double getMinMagnitude() {
		return minMagnitude;
	}

	public void setMinMagnitude(Double minMagnitude) {
		this.minMagnitude = minMagnitude;
	}

	public Double getMaxMagnitude() {
		return maxMagnitude;
	}

	public void setMaxMagnitude(Double maxMagnitude) {
		this.maxMagnitude = maxMagnitude;
	}

	@Override
	public String toString() {
		return "SismoMagnitud [minMagnitude=" + minMagnitude + ", maxMagnitude=" + maxMagnitude + "]";
	}	
	

}


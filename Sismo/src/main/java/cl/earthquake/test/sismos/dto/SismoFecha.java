package cl.earthquake.test.sismos.dto;


public class SismoFecha {
	
	private String starttime;	
	private String endtime;
	
	public SismoFecha() {}

	public SismoFecha(String starttime, String endtime) {
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	@Override
	public String toString() {
		return "SismoFecha [starttime=" + starttime + ", endtime=" + endtime + "]";
	}
	
	
	
	
	
	

	
	
}


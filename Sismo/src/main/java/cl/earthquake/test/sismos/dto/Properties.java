package cl.earthquake.test.sismos.dto;

public class Properties {
	
	private Double mag;
	private String place;
	private Double time;
	private Double updated;
	private Double tz;
	private String url;
	private String detail;
	private Double felt;
	private Double cdi;
	private Double mmi;
	private Double alert;
	private String status;
	private int tsunami;
	private int sig;
	private String net;
	private String code;
	private String ids;
	private String sources;
	private String types;
	private Double nst;
	private Double dmin;
	private Double rms;
	private Double gap;
	private String magType;
	private String type;
	private String title;	
	
	public Properties() {}

	public Properties(Double mag, String place, Double time, Double updated, Double tz, String url, String detail,
			Double felt, Double cdi, Double mmi, Double alert, String status, int tsunami, int sig, String net,
			String code, String ids, String sources, String types, Double nst, Double dmin, Double rms, Double gap,
			String magType, String type, String title) {
		this.mag = mag;
		this.place = place;
		this.time = time;
		this.updated = updated;
		this.tz = tz;
		this.url = url;
		this.detail = detail;
		this.felt = felt;
		this.cdi = cdi;
		this.mmi = mmi;
		this.alert = alert;
		this.status = status;
		this.tsunami = tsunami;
		this.sig = sig;
		this.net = net;
		this.code = code;
		this.ids = ids;
		this.sources = sources;
		this.types = types;
		this.nst = nst;
		this.dmin = dmin;
		this.rms = rms;
		this.gap = gap;
		this.magType = magType;
		this.type = type;
		this.title = title;
	}

	public Double getMag() {
		return mag;
	}

	public void setMag(Double mag) {
		this.mag = mag;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	public Double getUpdated() {
		return updated;
	}

	public void setUpdated(Double updated) {
		this.updated = updated;
	}

	public Double getTz() {
		return tz;
	}

	public void setTz(Double tz) {
		this.tz = tz;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Double getFelt() {
		return felt;
	}

	public void setFelt(Double felt) {
		this.felt = felt;
	}

	public Double getCdi() {
		return cdi;
	}

	public void setCdi(Double cdi) {
		this.cdi = cdi;
	}

	public Double getMmi() {
		return mmi;
	}

	public void setMmi(Double mmi) {
		this.mmi = mmi;
	}

	public Double getAlert() {
		return alert;
	}

	public void setAlert(Double alert) {
		this.alert = alert;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTsunami() {
		return tsunami;
	}

	public void setTsunami(int tsunami) {
		this.tsunami = tsunami;
	}

	public int getSig() {
		return sig;
	}

	public void setSig(int sig) {
		this.sig = sig;
	}

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getSources() {
		return sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public Double getNst() {
		return nst;
	}

	public void setNst(Double nst) {
		this.nst = nst;
	}

	public Double getDmin() {
		return dmin;
	}

	public void setDmin(Double dmin) {
		this.dmin = dmin;
	}

	public Double getRms() {
		return rms;
	}

	public void setRms(Double rms) {
		this.rms = rms;
	}

	public Double getGap() {
		return gap;
	}

	public void setGap(Double gap) {
		this.gap = gap;
	}

	public String getMagType() {
		return magType;
	}

	public void setMagType(String magType) {
		this.magType = magType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Properties [mag=" + mag + ", place=" + place + ", time=" + time + ", updated=" + updated + ", tz=" + tz
				+ ", url=" + url + ", detail=" + detail + ", felt=" + felt + ", cdi=" + cdi + ", mmi=" + mmi
				+ ", alert=" + alert + ", status=" + status + ", tsunami=" + tsunami + ", sig=" + sig + ", net=" + net
				+ ", code=" + code + ", ids=" + ids + ", sources=" + sources + ", types=" + types + ", nst=" + nst
				+ ", dmin=" + dmin + ", rms=" + rms + ", gap=" + gap + ", magType=" + magType + ", type=" + type
				+ ", title=" + title + "]";
	}
	
	
	

}

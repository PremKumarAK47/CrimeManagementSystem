package beans;

import java.sql.Date;
import java.util.List;

public class CrimeInfo {
	
	private Date date;
    private String place;
    private String crimeName;
    private List<String> victims;
    private String crimeDetails;
    private List<String> suspected;
    
	public CrimeInfo(Date date, String place, String crimeName, List<String> victims, String crimeDetails,
			List<String> suspected) {
		super();
		this.date = date;
		this.place = place;
		this.crimeName = crimeName;
		this.victims = victims;
		this.crimeDetails = crimeDetails;
		this.suspected = suspected;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCrimeName() {
		return crimeName;
	}

	public void setCrimeName(String crimeName) {
		this.crimeName = crimeName;
	}

	public List<String> getVictims() {
		return victims;
	}

	public void setVictims(List<String> victims) {
		this.victims = victims;
	}

	public String getCrimeDetails() {
		return crimeDetails;
	}

	public void setCrimeDetails(String crimeDetails) {
		this.crimeDetails = crimeDetails;
	}

	public List<String> getSuspected() {
		return suspected;
	}

	public void setSuspected(List<String> suspected) {
		this.suspected = suspected;
	}

	@Override
	public String toString() {
		return "CrimeInfo [date=" + date + ", place=" + place + ", crimeName=" + crimeName + ", victims=" + victims
				+ ", crimeDetails=" + crimeDetails + ", suspected=" + suspected + "]";
	}
    
    




}

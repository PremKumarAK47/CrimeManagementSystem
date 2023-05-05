package beans;

public class CriminalInfo {
	private String name;
	private int age;
	private String gender;
	private String address;
	private String identifyingMark;
	private String arrestedArea;
	private String crime;
	
	
	public CriminalInfo() {
		// TODO Auto-generated constructor stub
	}
	public CriminalInfo(String name, int age, String gender, String address, String identifyingMark,
			String arrestedArea, String crime) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.identifyingMark = identifyingMark;
		this.arrestedArea = arrestedArea;
		this.crime = crime;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdentifyingMark() {
		return identifyingMark;
	}
	public void setIdentifyingMark(String identifyingMark) {
		this.identifyingMark = identifyingMark;
	}
	public String getArrestedArea() {
		return arrestedArea;
	}
	public void setArrestedArea(String arrestedArea) {
		this.arrestedArea = arrestedArea;
	}
	public String getCrime() {
		return crime;
	}
	public void setCrime(String crime) {
		this.crime = crime;
	}
	@Override
	public String toString() {
		return "CriminalInfo [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", identifyingMark=" + identifyingMark + ", arrestedArea=" + arrestedArea + ", crime=" + crime + "]";
	}
	

}

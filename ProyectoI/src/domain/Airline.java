package domain;

public class Airline {

	private String Name;
	private String Country;
	
	public Airline() {}
	
	public Airline(String Name, String Country) {
		super();
		this.Name = Name;
		this.Country = Country;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getCountry() {
		return Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}
	
	public String toString() {
		return Name + "," + Country;
	}
}

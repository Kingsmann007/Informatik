public class Address{
	private String streetName;
	private String houseNumber;
	private String city;
	private String zip;

	public Address( String streetName, String houseNumber, String city, String zip){
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.city = city;
		this.zip = zip;
	}
	public String toString(){
		return this.streetName +", "+ this.houseNumber +", "+this.city+", "+this.zip; 	
	}
	public String getStreetName(){
		return streetName;
	}
	public void setStreetName(String streetName){
		this.streetName = streetName;
	}
	public String getHouseNumber(){
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber){
		this.houseNumber = houseNumber;
	}
	public String getCity(){
		return city;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getZip(){
		return zip;
	}
	public void setZip(String zip){
		this.zip = zip;
	}
}
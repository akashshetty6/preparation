package collection;

public class Address {

	String streetName;
	String place;
	int pincode;
	
	
	public Address(String streetName, String place, int pincode) {
		super();
		this.streetName = streetName;
		this.place = place;
		this.pincode = pincode;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", place=" + place + ", pincode=" + pincode + "]";
	}
	
	
	
}

package mynotes.corespring.test;

public class Address {
	
	private String street;
	private String city;
	private int pincode;
	
	@Override
	public String toString() {	
		return ("street::" + this.street + " city::" + this.city + " pincode::"
				+ this.pincode);
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}

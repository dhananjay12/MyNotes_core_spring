package mynotes.springjdbc.morebasics;

public class Employee{

	private int id;
	private String name;
	private String phoneNumber;
	
	@Override
	public String toString() {
		return ("Id=>" + this.id + " Name=>" + this.name+ " PhoneNumber=>"
				+ this.phoneNumber);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

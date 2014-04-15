package mynotes.corespring.test;

public class Employee {

	private int id;
	private String name;
	private Address homeAddress;
	private Address officeAddress;

	public Employee() {

	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return ("Id=>" + this.id + " Name=>" + this.name + "\nhomeAddress=>"
				+ this.homeAddress + "\nofficeAddress=>" + this.officeAddress);
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

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

}

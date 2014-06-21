package mynotes.corespring.beanpostprocessor;

public class Employee{

	private int id;
	private String name;
	private Address homeAddress;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return ("Id=>" + this.id + " Name=>" + this.name+ "\nhomeAddress=>"
				+ this.homeAddress );
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

}

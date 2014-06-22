package mynotes.corespring.contextaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee implements ApplicationContextAware{

	private int id;
	private String name;
	private ApplicationContext context;
	private Address officeAddress;
	private Address homeAddress;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(){
		
	}

	@Override
	public String toString() {
		return ("Id=>" + this.id + " Name=>" + this.name+ "\nhomeAddress=>"
				+ this.homeAddress +"\nofficeAddress=>"
				+ this.officeAddress);
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

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

}

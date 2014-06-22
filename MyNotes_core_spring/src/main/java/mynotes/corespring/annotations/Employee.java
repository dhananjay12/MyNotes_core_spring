package mynotes.corespring.annotations;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Employee{

	private int id;
	private String name;
	@Autowired
	private Address homeAddress;
	@Autowired
	@Qualifier(value="officeQualifier")
	private Address officeAddress;
	@Resource(name="permAdd")
	private Address permanentAddress;

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
				+ this.officeAddress+"\npermanentAddress=>"
						+ this.permanentAddress);
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
	//@Required
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	@PostConstruct
	public void myCustomInit() {
		System.out.println("myCustomInit called after bean initialized");
	}
	@PreDestroy
	public void myCustomDestroy() {
		System.out.println("myCustomDestroy called before bean get destroyed");
	}

}

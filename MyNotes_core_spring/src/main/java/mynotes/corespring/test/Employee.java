package mynotes.corespring.test;

import java.util.Iterator;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private Address homeAddress;
	private Address officeAddress;
	private List<String> programmingLaguages;

	public Employee() {

	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		String allLanguages = null;
		
		for (String language : this.programmingLaguages) {
			if(allLanguages==null){
			allLanguages=language+";";
			}else{
			allLanguages=allLanguages+language+";";
			}
		}
		
		return ("Id=>" + this.id + " Name=>" + this.name + "\nhomeAddress=>"
				+ this.homeAddress + "\nofficeAddress=>" + this.officeAddress
				+ " \nAllLanguage=>"+allLanguages);
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

	public List<String> getProgrammingLaguages() {
		return programmingLaguages;
	}

	public void setProgrammingLaguages(List<String> programmingLaguages) {
		this.programmingLaguages = programmingLaguages;
	}

}

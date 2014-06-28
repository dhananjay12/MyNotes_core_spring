package mynotes.spring.hibernateModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee{
	@Id
	private int id;
	private String name;
	private String phone;
	
	@Override
	public String toString() {
		return ("Id=>" + this.id + " Name=>" + this.name+ " phone=>"
				+ this.phone);
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
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

package mynotes.corespring.events;

import org.springframework.stereotype.Component;

@Component
public class Employee{

	private int id;
	private String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(){
		
	}

	@Override
	public String toString() {
		return ("Id=>" + this.id + " Name=>" + this.name);
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
}

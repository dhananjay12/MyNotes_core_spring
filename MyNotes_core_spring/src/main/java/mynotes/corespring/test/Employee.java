package mynotes.corespring.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
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

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet called after bean initialized");
	}

	public void destroy() throws Exception {
		System.out.println("destroy called before bean get destroyed");

	}

	public void myCustomInit() {
		System.out.println("myCustomInit called after bean initialized");
	}

	public void myCustomDestroy() {
		System.out.println("myCustomDestroy called before bean get destroyed");
	}

}

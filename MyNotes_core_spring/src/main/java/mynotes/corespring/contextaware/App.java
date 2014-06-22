package mynotes.corespring.contextaware;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/mynotes/corespring/contextaware/spring.xml");
		context.registerShutdownHook();
		Employee employee=(Employee) context.getBean("employee1");
		System.out.println(employee);
		employee=(Employee) context.getBean("employee2");
		System.out.println(employee);
		
	}

}

package mynotes.corespring.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/mynotes/corespring/annotations/spring.xml");
		context.registerShutdownHook();
		Employee employee=(Employee) context.getBean("employee");
		System.out.println(employee);
		
	}

}

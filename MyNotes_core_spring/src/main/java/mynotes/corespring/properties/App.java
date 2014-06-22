package mynotes.corespring.properties;

import java.util.Locale;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/mynotes/corespring/properties/spring.xml");
		context.registerShutdownHook();
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
		System.out.println(context.getMessage("greeting1", null,
				"Default Greeting message", null));
		System.out.println(context.getMessage("greeting3", null,
				"Default Greeting message", null));
		System.out.println(context.getMessage("greeting2", new Object[] {
				employee.getName(), employee.getId() },
				"Default Greeting message", null));
		System.out.println(context.getMessage("greeting2", new Object[] {
				employee.getName(), employee.getId() },
				"Default Greeting message", new Locale("es", "ES")));
		System.out.println(context.getMessage("greeting2", new Object[] {
				employee.getName(), employee.getId() },
				"Default Greeting message", Locale.FRENCH));

	}

}

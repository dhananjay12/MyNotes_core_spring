package mynotes.corespring.events;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("/mynotes/corespring/events/spring.xml");
		context.registerShutdownHook();	
		MyEventPublisher myEventPublisher=(MyEventPublisher) context.getBean("myEventPublisher");
		myEventPublisher.myPublisher("Publish this message");
		myEventPublisher.myPublisher("Publish another message");
	}

}

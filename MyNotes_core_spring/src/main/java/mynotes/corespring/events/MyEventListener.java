package mynotes.corespring.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener<MyEvent> {

	/*public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString());
	}*/

	public void onApplicationEvent(MyEvent event) {
		System.out.println(event.toString());
		
	}	

}

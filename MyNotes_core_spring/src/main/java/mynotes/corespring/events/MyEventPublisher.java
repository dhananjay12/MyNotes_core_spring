package mynotes.corespring.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher publisher = null;

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher=applicationEventPublisher;		
	}
	
	public void myPublisher(String message){
		publisher.publishEvent(new MyEvent(this, message));
	}

}

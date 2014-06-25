package mynotes.corespring.events;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent{
	
	private String message;

	public MyEvent(Object source,String message) {
		super(source);
		this.message=message;
	}
	@Override
	public String toString() {
		return "MyEvent occured";
	}

	public String getMessage() {
		return message;
	}

}

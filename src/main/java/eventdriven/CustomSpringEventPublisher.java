package eventdriven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventPublisher {
	
	@Autowired
	private ApplicationEventPublisher appPublisher;
	
	public void publishEvents(final String  message) {
		System.out.println("Publishing the Custom Event...");
		CustomSpringEvent event = new CustomSpringEvent(this, message);
		appPublisher.publishEvent(event);
		
	}
	
	
}

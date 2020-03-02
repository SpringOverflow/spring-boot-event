package eventdriven;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventLisner implements ApplicationListener<CustomSpringEvent> {

	@Override
	public void onApplicationEvent(CustomSpringEvent event) {
		System.out.println("Received event "+event.getMessage());
		
	}

}

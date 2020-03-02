package eventdriven;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventLisener2 implements ApplicationListener<CustomSpringEvent> {

	@Override
	public void onApplicationEvent(CustomSpringEvent event) {
		System.out.println("This is the Second Listener listening..."+event.getMessage());
	}

}

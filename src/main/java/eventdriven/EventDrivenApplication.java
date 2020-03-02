package eventdriven;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class EventDrivenApplication {
	
	@Autowired
	CustomSpringEventPublisher publisher;
	
	public static void main(String[] args) {
		SpringApplication.run(EventDrivenApplication.class, args);
	}
	
	@Scheduled(fixedDelay = 5000)
	public void publishEvent() {
		 publisher.publishEvents("Good Evening");
	}

}

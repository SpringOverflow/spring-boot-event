package eventdriven;

import org.springframework.context.ApplicationEvent;

import lombok.Data;

@Data
public class CustomSpringEvent extends ApplicationEvent {
	
	private String message;

	public CustomSpringEvent(Object source,String message) {
		super(source);
		this.message = message;
	}

}

package spring.action;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.config.SpringJavaConfig;
import spring.model.Room;

public class DemoRooMAction {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		Room room1 = context.getBean("room1",Room.class);
		System.out.println(room1.getId()+" "+room1.getName()+" "+room1.getSize());
		
		context.close();
	}

}

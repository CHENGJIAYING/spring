package spring.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.util.*;

public class DemoLogProviderAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		LogProvider logProvider = (LogProvider)context.getBean("logProvider");
		logProvider.log("Have a good day !!");
		((ConfigurableApplicationContext)context).close();

	}

}

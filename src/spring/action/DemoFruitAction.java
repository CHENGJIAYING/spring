package spring.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.Fruit;
import spring.model.FruitService;

public class DemoFruitAction {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		
		Fruit fruit = context.getBean("fruit",Fruit.class);
		fruit.setId(100);
		fruit.setName("banana");
		
		System.out.println(fruit.getId()+" "+fruit.getName());
		
		FruitService fruitService = context.getBean("fruitService",FruitService.class);
		fruitService.showInfo();
		context.close();
	}

}

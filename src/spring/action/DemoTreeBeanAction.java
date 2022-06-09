package spring.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.TreeBean;

public class DemoTreeBeanAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.config.xml");
		TreeBean tree = context.getBean("tree",TreeBean.class);
		System.out.println("Name:"+tree.getName());
		System.out.println("Age:"+tree.getAge());
		context.close();

	}

}

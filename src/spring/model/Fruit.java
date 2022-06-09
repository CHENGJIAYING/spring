package spring.model;

import org.springframework.stereotype.Component;

@Component(value = "fruit")//註冊1個been  = <bean id = "fruit" class="spring.model.Fruit"/>
public class Fruit {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

package spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "fruitDao")
public class FruitDao {
	
	@Autowired
	private Fruit fruit;
	
	public void showInfo() {
		System.out.println("info:" + fruit.getId()+" "+fruit.getName());
	}
}

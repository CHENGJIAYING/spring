package spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "fruitService")
public class FruitService {
	
	@Autowired
	private FruitDao fruitDao;
	
	public void showInfo() {
		fruitDao.showInfo();
	}
}

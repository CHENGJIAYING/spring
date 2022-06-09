package spring.action;


import java.util.ArrayList;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import spring.model.TruckBean;

public class DemoSpelAction {

	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		
		Expression express1 = parser.parseExpression("'hola,' + ' Amigo!!'");
		String result1 = express1.getValue().toString();
		System.out.println("result1:"+result1);
		
		Expression express2 = parser.parseExpression("2*5+1");
		int result2 = express2.getValue(Integer.class);
		System.out.println("result2:"+result2);
		
		EvaluationContext ectx = new StandardEvaluationContext();
		
//		TruckBean truck1 = new TruckBean(1001,"BMW");
//		TruckBean truck2 = new TruckBean(1002,"Ferrari");
		
		ArrayList<TruckBean> trucks = new ArrayList<TruckBean>();
//		trucks.add(truck1);
//		trucks.add(truck2);
		trucks.add(new TruckBean(1001,"BMW"));
		trucks.add(new TruckBean(1002,"Ferrari"));
		
		ectx.setVariable("trucks", trucks);
		
		int id = parser.parseExpression("#trucks[0].id").getValue(ectx,Integer.class);
		String brand = parser.parseExpression("#trucks[0].brand").getValue(ectx,String.class);
		System.out.println("id:"+id);
		System.out.println("brand:"+brand);
		

	}

}

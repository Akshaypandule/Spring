package Com.spring.springexpression;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception 
	{

		
		ApplicationContext context=new ClassPathXmlApplicationContext("Com/spring/springexpression/stereoconfig.xml");
		Demo d1=context.getBean("demo",Demo.class);
		System.out.println(d1);
		
		/*SpelExpressionParser exp=new SpelExpressionParser();
		Expression expre=(Expression) exp.parseExpression("#{22+44}");
		System.out.println(expre.getValue());*/
	}

}

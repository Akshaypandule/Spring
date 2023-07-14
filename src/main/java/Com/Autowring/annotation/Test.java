package Com.Autowring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) 
  {
	@SuppressWarnings("resource")
	ApplicationContext context= new ClassPathXmlApplicationContext("Com/Autowring/annotation/autoconfig.xml"); 
	Employee emp=(Employee) context.getBean("employee1");
	System.out.println(emp); 
  }


}

package Com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Com/spring/Collection/collection.xml");
	    Employee emp1=(Employee)context.getBean("emp1");
	    System.out.println(emp1.getname());
	    System.out.println(emp1.getphone());
	    System.out.println(emp1.getaddress());
	    System.out.println(emp1.getcourse());
		

	}

}

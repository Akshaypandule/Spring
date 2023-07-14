package Com.spring.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext
				("Com/spring/standalone/collection/aloneconfig.xml");
		Person person=(Person)context.getBean("person1");
		Person person1=(Person)context.getBean("person2");
		System.out.println(person.getFriends());
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("-------------------------------------------------");
		System.out.println(person.getFeestructure());
		System.out.println(person1.getFeestructure().getClass().getName());
	}

}

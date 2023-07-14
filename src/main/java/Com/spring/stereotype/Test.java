package Com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context=
				new ClassPathXmlApplicationContext("Com/spring/stereotype/stereoconfig.xml");
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		System.out.println(student.getAddress().getClass().getName());
		System.out.println(student.hashCode()); // By using Annotaton
		Student student1=context.getBean("student",Student.class);
		System.out.println(student1.hashCode());
		
		
		Techare tech= context.getBean("tech",Techare.class);
		System.out.println(tech.hashCode());  // By using xml file
		Techare tech2= context.getBean("tech",Techare.class);
		System.out.println(tech2.hashCode());
	
	
	}

}

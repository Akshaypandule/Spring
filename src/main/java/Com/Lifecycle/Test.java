package Com.Lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("Com/lifecycle/config.xml");
		xmllife p=(xmllife)context.getBean("samosa");
		System.out.println(p);
		context.registerShutdownHook();

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Pepsi p1=(Pepsi)context.getBean("pepsi");
		System.out.println(p1);
		
		
		Example example=(Example)context.getBean("example");
		System.out.println(example);
	}
}
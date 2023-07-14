package Com.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi  implements InitializingBean,DisposableBean
{
	
 	private double price;
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public Pepsi()
	{
		super();
	}
	public String toString()
	{
		return "Pepsi [Price=" +price+"]";
	}
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Taking pepsi");
	}
	public void destroy() throws Exception
	{
		System.out.println("Going to put bottle back to shop after :destroy");
		
	}

}

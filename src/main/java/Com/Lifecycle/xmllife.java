package Com.Lifecycle;

public class xmllife 
{
	private Double price;
	
	public Double getPrice()
	{
		return price;
	}
	public void setPrice(Double price)
	{
		System.out.println("Setting price");
		this.price=price;
	}
	
	public xmllife()
	{
		super();
	}
	
	public String toString()
	{
		return "Samosa [price=" +price+"]";
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	public void destroy()
	{
		System.out.println("Inside destroy Method");
	}

}

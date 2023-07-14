package Com.Autowring;

public class Employee
{
	private Address address;
	
	public Employee(Address address)
	{
		super();
		this.address=address;
		System.out.println("Insite constructor");
		
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address=address;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	

}

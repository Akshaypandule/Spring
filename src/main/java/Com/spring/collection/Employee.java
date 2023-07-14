package Com.spring.collection;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Employee 
{
	private String name;
	private List<String> phone;
	private Set<String> address;
	private Map<String, String> course;
	
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public List<String> getphone()
	{
		return phone;
	}
	public void setphone(List<String> phone)
	{
		this.phone=phone;
	}
	public Set<String> getaddress()
	{
		return address;
	}
	public void setaddress(Set<String> address)
	{
		this.address=address;
	}
	public Map<String, String> getcourse()
	{
		return course;
	}
	public void setcourse(Map<String,String> course)
	{ 
		this.course=course;
	}
	public Employee(String name,List<String>phone,Set<String>address,Map<String,String>course)
	{
		this.name=name;
		this.phone=phone;
		this.address=address;
		this.course=course;
	}
	public Employee()
	{
		
	}

	
}

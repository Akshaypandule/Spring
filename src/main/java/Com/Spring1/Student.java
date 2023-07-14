package Com.Spring1;

public class Student 
{
	private int id;
	private String name;
	private String Address;
	
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String Address()
	{
		return Address;
	}
	public void setAddress(String Address)
	{
		this.Address=Address;
	}
	public Student(int id,String name,String Address)
	{
		this.id=id;
		this.name=name;
		this.Address=Address;
	}
	public Student()
	{
		
	}
	public String toString()
	{
		return id+" "+name+" "+Address;
	}

}

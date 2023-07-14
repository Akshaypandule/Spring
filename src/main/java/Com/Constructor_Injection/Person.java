package Com.Constructor_Injection;

import java.util.List;

public class Person 
{
	private String name;
	private int personid;
	private certi certi;
	private List<String>list;
	
	
	public Person(String name,int personid,certi certi,List<String>list)
	{
		this.name=name;
		this.personid=personid;
		this.certi=certi;
		this.list=list;
	}
	public String toString()
	{
		return this.name+" :"+this.personid+ "{"+ this.certi.name+"}"+this.list;
				
	}

}

package Com.Lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example 
{
	private String exam;
	
	public String getExam()
	{
		return exam;
	}
	public void setExam(String exam)
	{
		this.exam=exam;
	}
	public Example()
	{
		super();
	}
	public String toString()
	{
		return this.exam;
	}
	@PostConstruct
	public void start()
	{
		System.out.println("Starting Method");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("Ending method");
	}

}

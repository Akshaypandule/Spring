package Com.spring.stereotype;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")  //By using Annotation declare Scope
public class Student
{
	@Value("Akshay Pandule")
	private String studentname;
	@Value("Pune")
	private String city;
	@Value("#{temp}")
	private List<String>address;
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getStudentname()
	{
		return studentname;
	}
	public void setStudentname(String studentname)
	{
		this.studentname=studentname;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String toString()
	{
		return "Student [Studentname= "+studentname+" City= "+city+"]";
	}

}

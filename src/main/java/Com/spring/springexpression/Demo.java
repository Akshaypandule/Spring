package Com.spring.springexpression;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Demo 
{
	@Value("#{22+11}")
	private int x;
	@Value("#{2+5+56+34}")
	private int y;
	
	private int z;
	
	public int getZ() 
	{
		return z;
	}
 
	public void setZ(int z)
	{
		this.z = z;  }

	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y=y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	

}

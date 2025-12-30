//we want to create program to store five values in Vector  and fetch data and display it 
import java.util.*;
public class VectorDisplayDataAPP
{
	public static void main(String x[])
	{
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
	
		Iterator i = v.iterator();
		while( i .hasNext())
		{
			Object obj = i.next();
			
			System.out.print(obj+" ");
		}
	}
}
		
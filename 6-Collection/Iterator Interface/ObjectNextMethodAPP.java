import java.util.*;
public class ObjectNextMethodAPP
{
	public static void main(String x[])
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		Iterator i = al.iterator();
		
		while(i.hasNext())
		{
			Object obj = (Integer)i.next();
			if((Integer)obj==10)
			{
				i.remove();
			}
			
		}
		System.out.println(al);
	}
}
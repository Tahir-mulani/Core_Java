import java.util.*;
public class IteratorMethodsApplication
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			Object obj = i.next();
			 
			 if(obj.equals(20))
				 i.remove();
			System.out.print(obj+" ");
		}
		System.out.println("\nAfter remove element :"+list);
	}
}
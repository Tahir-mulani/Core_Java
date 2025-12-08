import java.util.*;
public class RemoveElementMethodAPP
{
	public static void main(String x[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Iterator<Integer> i = list.iterator();
		System.out.println("before remove: "+list);
		while(i.hasNext())
		{
			Integer n = i.next();
			if(n==20)
			{
				i.remove();  //removal during iteration
			}
		}
		
		System.out.println("after remove: "+list);
	}
}
		
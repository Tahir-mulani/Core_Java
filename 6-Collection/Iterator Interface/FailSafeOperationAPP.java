//FailSafe Operation
import java.util.*;
import java.util.concurrent.*;
public class FailSafeOperationAPP
{
	public static void main(String x[])
	{
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		
		int index = 0;
		
		System.out.println("Before Operation "+list);
		
		for(Object obj : list)
		{
			int val = (int)obj*10;
			
			list.set(index,val);
			++index;
		}
		System.out.println("After Operation "+list);
	}
}
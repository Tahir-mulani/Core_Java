import java.util.*;
public class CollectionsMethodApplication
{
	public static void main(String x[])
	{
		List list = new ArrayList();
		list.add(40);
		list.add(100);
		list.add(50);
		list.add(30);
		list.add(90);
		
		Object maxValue = Collections.max(list);
		Object minValue = Collections.min(list);
		
		System.out.println("Before swapping "+list);
		Collections.swap(list,1,2);
		
		System.out.println("Max Value from collection "+maxValue);
		System.out.println("Min Value from collection "+minValue);
		System.out.println("After swapping "+list);
		System.out.println("Before reverse "+list);
		
		Collections.reverse(list);
		System.out.println("After reverse "+list);
		
		List list1 = Collections.synchronizedList(list);
		System.out.println("Synchronized List is "+list1);
	}
}
		
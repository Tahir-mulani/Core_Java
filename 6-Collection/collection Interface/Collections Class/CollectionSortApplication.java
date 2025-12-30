// WAP to create ArrayList and store  5 values in it and sort the ArrayList data.
import java.util.*;
public class CollectionSortApplication
{
	public static void main(String x[])
	{
		List list = new ArrayList();
		list.add(40);
		list.add(100);
		list.add(50);
		list.add(30);
		list.add(90);
		
		System.out.println("Before sorting ");
		for(Object obj:list)
		{
			System.out.println(obj+"\t");
		}
		Collections.sort(list);
		System.out.println("\nAfter sorting ");
		for(Object obj:list)
		{
			System.out.println(obj+"\t");
		}
	}
}
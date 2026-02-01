import java.util.*;
public class Remove_Duplicated
{	
	public static void main(String x[])
	{
		ArrayList<Integer>  list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(4);
		
		List<Integer> list2 = new ArrayList<>();
		for(int i=0;i<list1.size();i++)
		{
			if(!list2.contains(list1.get(i)))
			{
				list2.add(list1.get(i));
			}
		}
		
		System.out.println(list2);
	}
}
/*Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/

import java.util.*;
public class MergeArrayListAPP
{
	public static void main(String x[])
	{
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		ArrayList list2 = new ArrayList();
		list2.add(40);
		list2.add(30);
		list2.add(60);
		list2.add(20);
		list2.add(10);
		ArrayList list3=new ArrayList();
		for(int i =0;i<list1.size();i++)
		{
			if(!list3.contains((int)list1.get(i)))
			{
				list3.add((int)list1.get(i));
			}
		}
		
		for(int i=0;i<list2.size();i++)
		{
			if(!list3.contains((int)list2.get(i)))
			{
				list3.add((int)list2.get(i));
			}
		}
		for(Object b: list3)
		{
			System.out.println(b);
		}		
		 
	}
}
		
	

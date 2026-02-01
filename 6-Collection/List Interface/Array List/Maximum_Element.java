//Add 10 integers to an ArrayList and find the maximum element
import java.util.*;
public class Maximum_Element
{
	public static void main(String x[])
	{
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(60);
		
		int max = 0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)>max)
			{
				max = list.get(i);
			}
		}
		System.out.println("Maximum Element is "+max);
	}
}
		
/*

Reverse an ArrayList without using Collections.reverse()

Remove all even numbers from a List

Find duplicate elements in a List

Sort a List in descending order

Merge two Lists into one

Find the second largest element in a List

Convert List to Array

Find common elements between two Lists

Check whether a List is palindrome
*/
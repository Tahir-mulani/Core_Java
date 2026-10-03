/*Write a Java program to merge two ArrayList<Integer> objects into 
a single sorted ArrayList without using Collections.sort() or Stream API. 
Remove duplicate elements from the final list.
Example: 
List 1: [10, 30, 20, 50, 30] 
List 2: [40, 20, 60, 10] 
Output: [10, 20, 30, 40, 50, 60]*/
import java.util.*;
public class MergeTwoArrayListApp
{
	public static void main(String x[])
	{
		List<Integer> list1 = Arrays.asList(10, 30, 20, 50, 30);
		List<Integer> list2 = Arrays.asList(40, 20, 60, 10);
		
		List<Integer> resultList = new ArrayList<>();
		
		Set<Integer> set = new TreeSet<>();
		for(int data:list1){
				set.add(data);
		}
		for(int data:list2){
			set.add(data);
		}
		System.out.println(set);
		 
	}
}
		
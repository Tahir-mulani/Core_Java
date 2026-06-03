/*6. Merge Two Sorted Integer Lists
Description
Merge two sorted integer lists into a single sorted list.*/
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class MergeTwoSortedLists
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size");
		int size = sc.nextInt();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		System.out.println("Enter Element in list1");
		for(int i=0;i<size;i++)
		{
			list1.add(sc.nextInt());
		}
		System.out.println("Enter Element in list2");
		for(int i=0;i<size;i++)
		{
			list2.add(sc.nextInt());
		}
		Collections.sort(list1);
		Collections.sort(list2);
		List<Integer> result =  getMeregedList(list1,list2);
		for(Integer i:result)
		{
			System.out.print(i+" ");
		}
	}
	public static List<Integer> getMeregedList(List<Integer> list1,List<Integer> list2)
	{
		List<Integer> result = new ArrayList<>();
		result.addAll(list1);
		result.addAll(list2);
		Collections.sort(result);
		return result;
	}
}
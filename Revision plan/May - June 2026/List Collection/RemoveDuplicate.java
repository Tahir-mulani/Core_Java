/*1. Remove Duplicate Integers
Description
Given a list of integers, remove all duplicate values while preserving the original insertion order.
Example
Input:
[10, 20, 10, 30, 20, 40]
Expected Output:
[10, 20, 30, 40]*/
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
public class RemoveDuplicate
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size");
		int size = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter Element in list");
		
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		
		LinkedList<Integer> result = getUniqueElement(list);
		System.out.println(result);
	}
	public static LinkedList<Integer> getUniqueElement(LinkedList<Integer> list)
	{
		LinkedList<Integer> uniqueList = new LinkedList<>();
		
		for(Integer num :list)
		{
			if(!uniqueList.contains(num))
			{
				uniqueList.add(num);
			}
		}
		return uniqueList;
	}
}
	
		
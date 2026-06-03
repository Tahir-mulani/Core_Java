/*
7. Find Missing Number
Description
Numbers from 1 to N are stored in a list with one number missing.
Find the missing number.*/
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class MissingNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size");
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter elements in list");
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		int result = findMissingNumber(list);
		if(result > 0)
			System.out.println(result);
		else
			System.out.println("There is a no missing number in list");
			
	}
	public static int findMissingNumber(List<Integer> list)
	{
		int missing = 0;
		Collections.sort(list);
		int max = list.get(list.size()-1);
		for(int i=1;i<=max;i++)
		{
			if(!list.contains(i))
				return i;
		}
		
		return -1;
				
	}
	
}
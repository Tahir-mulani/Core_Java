/*8. Separate Even and Odd Numbers
Description
Create a list where all even numbers appear before odd numbers.*/
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class EvenOddAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size");
		int size = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter Element in list");
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		
		List<Integer> result = getEvenOdd(list);
		for(int i: result)
		{
			System.out.print(i+" ");
		}
	}
	public static List<Integer> getEvenOdd(List<Integer> list)
	{
		List<Integer> result = new ArrayList<>();
		
		for(Integer i : list)
		{
			if(i % 2==0)
				result.add(i);
		}
		for(Integer i : list)
		{
			if(i % 2 != 0)
				result.add(i);
		}
		return result;	
	}
}
	
	
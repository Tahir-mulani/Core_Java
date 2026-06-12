/*33. Sort Integers in Ascending Order
Description: Arrange integers from smallest to largest.*/
import java.util.*;
public class AscendingIntegers
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size");
		int size = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		
		System.out.println("Before Sorting");
		for(int i:list)
		{
			System.out.println(i);
		}
		
		Collections.sort(list);
		System.out.println("After Sorting");
		for(int i:list)
		{
			System.out.println(i);
		}
	}	
}
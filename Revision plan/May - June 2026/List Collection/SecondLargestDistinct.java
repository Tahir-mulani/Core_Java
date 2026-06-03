/*2. Find Second Largest Number
Description
Find the second largest distinct integer from a list.
Example
Input:
[10, 50, 30, 50, 20]
Expected Output: 30 */
import java.util.ArrayList;
import java.util.Scanner;
public class SecondLargestDistinct
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
		
		int result = getSecondLargestDistinctElement(list);
		if(result < 1)
		{
			System.out.println("there is no second largest value in list");
		}
		else
		{
			System.out.println(result);
		}
		
	}
	public static int getSecondLargestDistinctElement(ArrayList<Integer> list)
	{
		int max=Integer.MIN_VALUE;
		int smax =Integer.MIN_VALUE;
		
		for(Integer num:list)
		{
			if(num > max)
			{
				smax = max;
				max = num;
			}
			else if(num > smax && num != max)
			{
				smax = num;
			}
		}
		return smax;
	}
}
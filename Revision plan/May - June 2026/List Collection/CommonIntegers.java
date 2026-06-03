/*5. Find Common Integers Between Two Lists
Description
Find all common integers between two lists.
Example
Input:
List1 = [1,2,3,4]
List2 = [3,4,5,6]
Expected Output:
[3,4]*/
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class CommonIntegers
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
		List<Integer> result = getCommonIntegers(list1,list2);
		for(Integer i:result)
		{
			System.out.print(i+" ");
		}
	}
	public static List<Integer> getCommonIntegers(List<Integer> list1,List<Integer> list2)
	{
		List<Integer> result = new ArrayList<>();
		
		for(Integer num1:list1)
		{
			for(Integer num2:list2)
			{
				if(num1.equals(num2))
				{
					result.add(num2);
				}
			}
		}
		
			
		return result;
	}

}

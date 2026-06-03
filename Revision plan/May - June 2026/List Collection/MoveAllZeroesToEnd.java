/*4. Move All Zeroes to End
Description
Move all zero values to the end while maintaining the order of non-zero elements.
Example
Input:
[0,1,0,3,12]
Expected Output:
[1,3,12,0,0]*/
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class MoveAllZeroesToEnd
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size");
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter Element in list");
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		
		List<Integer> result = moveAllZeroresToEnd(list);
		for(int i: result)
		{
			System.out.print(i+" ");
		}
	}
	public static List<Integer> moveAllZeroresToEnd(List<Integer> list)
	{
		List<Integer> result = new ArrayList<>();
		int count =0;
		for(Integer i:list)
		{
			if(i==0) 
				count++;
			else
				result.add(i);
		}
		
		while(count >0)
		{
			result.add(0);
			count--;
		}
		return result;
	}
}

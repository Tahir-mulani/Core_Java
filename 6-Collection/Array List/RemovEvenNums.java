/*
Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer
*/
import java.util.*;
public class RemovEvenNums
{	
	public static void main(String x[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter array size");
		int n= sc.nextInt();
		int arr [] =new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++)
		{
			  arr[i]=sc.nextInt();
		}
		
		ArrayList list = new ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
			 list.add(arr[i]);
		}
		
		
		//list.add(arr);
		System.out.println("Before remove even numbers :"+list);
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			Object obj = i.next();
			if((int)obj%2==0)
			{
				i.remove();
			}
		}
		System.out.println("After remove even numbers :"+list);
	}
}
		
	 
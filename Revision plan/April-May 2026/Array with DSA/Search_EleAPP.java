//Write a java program to search an element in an array , its element found or not.
import java.util.*;
public class Search_EleAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array Element");
		for(int i=0;i<n;i++)
		{			 
			arr[i] = sc.nextInt();		
		}
		
		System.out.println("Enter search element");
		int target = sc.nextInt();
		boolean flag = true;
		for(int i=0;i<n;i++)
		{
			if(arr[i] == target)
			{
				System.out.println("element found "+arr[i]);
				flag = false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("Element not found");
		}
		
	}
}
//Write a java program to copy one array to another array
import java.util.*;
public class Copy_ArrayAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int result[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			result[i] = arr[i];
		}
		for(int num : result)
		{
			System.out.print(num+" ");
		}
		

	}
}

//Write a java program to find common elements between two arrays.
import java.util.*;
public class Common_EleAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Array size");
		int n = sc.nextInt();
		
		System.out.println("Enter second Array size");
		int n1 = sc.nextInt();
		int arr[] = new int[n];
		int arr1[] = new int[n1];
		
		System.out.println("Enter  first Array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter  second Array element");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		//common elements
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n1;j++)
			{
				if(arr[i] == arr1[j])
				{
					System.out.print(arr[i]+" ");
					break; //avoid duplicate 
				}
			}
		}
	}
}
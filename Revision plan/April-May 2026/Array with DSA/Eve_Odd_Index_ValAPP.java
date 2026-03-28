// Write a Java program to display even & odd index values from an array
import java.util.*;
public class Eve_Odd_Index_ValAPP
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
		
		for(int i=0;i<n;i++)
		{
			if(i%2 ==0)
			{
				System.out.print("\nEven index -> "+arr[i]);
			}
			else
			{
				System.out.print("\nOdd index-> "+arr[i]);
			}
		}
	}
}
//Write a Java program to calculate the sum of all elements in an array.
import java.util.*;
public class Calculate_Sum_EleAPP
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
		
		int sum =0;
		for(int i=0;i<n;i++)
		{
			sum += arr[i];
		}
		System.out.println("Sum of elements "+sum);
	
	}
}
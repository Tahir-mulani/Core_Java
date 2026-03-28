//Write a Java program to input an array & display it.
import java.util.*;
public class Display_Array_EleAPP
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
		System.out.println("Given array");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
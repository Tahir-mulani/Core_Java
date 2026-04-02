//Write a java program to display only non-zero values from an array.
import java.util.*;
public class Display_NonZero_EleAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		
		System.out.println("Enter array Element");
		for(int i=0;i<n;i++)
		{			 
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
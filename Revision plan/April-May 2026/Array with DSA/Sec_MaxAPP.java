//Write a java program to give an array, find the second largest element.
import java.util.*;
public class Sec_MaxAPP
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
		int max = Integer.MIN_VALUE;
		int smax =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				smax = max;
				max = arr[i];
			}
			else if(arr[i] < max && arr[i] > smax)
			{
				smax = arr[i];
			} 
		}
		System.out.println(smax);
	}
}
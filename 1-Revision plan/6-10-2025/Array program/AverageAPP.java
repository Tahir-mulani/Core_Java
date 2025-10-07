//3. Calculate the Sum and Average of Elements

import java.util.*;
public class AverageAPP
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		double Average = (double)sum/n;
		System.out.println("Average of Elements: "+Average);
	}
}
		
		
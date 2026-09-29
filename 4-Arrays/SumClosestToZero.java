/*write a java program to find two elements whose sum is closest to zero
expected output:
given array : 38 44 63 -51 -35 19 84 -69 4 -46
the pair of elements whose sum is minimum are:
[44, -46]
*/
import java.util.*;
public class SumClosestToZero
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int minSum =Integer.MAX_VALUE;
		int start=0,end=0;
		for(int i=0;i<n;i++)
		{
			int sum = 0;
			for(int j=i+1;j<n;j++)
			{
				sum = arr[i] + arr[j];
				if(Math.abs(sum) < Math.abs(minSum))
				{
					minSum = sum;
					start =arr[i];
					end = arr[j];
				}
			}					
		}
		System.out.println(start+" "+end);
			
		
	}
}
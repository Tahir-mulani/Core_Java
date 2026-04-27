import java.util.*;
public class Second_Largest_Element
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");		
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array element");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int result = secondLargest(arr);
		if(result < 0)
		{
			System.out.println("There is no Second Largest value in array");
		}
		else
		{
			System.out.println("The Second Largest value in array "+result);
		}
		
		
	}
	public static int secondLargest(int arr[])
	{
		int max = Integer.MIN_VALUE,smax = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				smax = max;
				max = arr[i];
			}
			else if(arr[i] > smax && arr[i] != max)
			{
				smax = arr[i];
			}
			else{
			}
		}
		
		return smax;
		
	}
}
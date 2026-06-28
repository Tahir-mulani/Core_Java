//Second smallest element
import java.util.Scanner;
public class SecondSmallestEle
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		findSecondSmallgestElement(arr);
	}
	public static void findSecondSmallgestElement(int arr[])
	{
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		//max = 2147483647  min = 2147483648
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				smin = min;
				min= arr[i];
			}
			else if(arr[i] < smin && arr[i] != min)
			{
				smin = arr[i];
			}
			else
			{
				continue;
			}
		}
		
		System.out.println("Second Smallest Element "+smin);
	}
}
//Second largest element
import java.util.Scanner;
public class SecondLargestEle
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
		findSecondLargestElement(arr);
	}
	public static void findSecondLargestElement(int arr[])
	{
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		//max = 2147483647  min = 2147483648
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				smax = max;
				max= arr[i];
			}
			else if(arr[i] > smax && arr[i] != max)
			{
				smax = arr[i];
			}
			else
			{
				continue;
			}
		}
		
		System.out.println("Second Largest Element "+smax);
	}
}
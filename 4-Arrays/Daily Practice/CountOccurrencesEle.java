//Count occurrences of a given element
import java.util.Scanner;
public class CountOccurrencesEle
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
		
		getCountOccurrence(arr);
	}
	public static void getCountOccurrence(int arr[])
	{
		int n = arr.length;
		boolean[] flag = new boolean[n];
		for(int i=0;i<n;i++)
		{
			if(flag[i])
				continue;
			int count = 1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					flag[j] = true;
				}
			}
			System.out.println(arr[i]+"--->"+count);
		}
	}
}
		
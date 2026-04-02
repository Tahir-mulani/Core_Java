//Write a Java program to count even & odd values from an array.
import java.util.*;
public class Count_Eve_Odd_ValAPP
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
		
		int evecnt =0,oddcnt =0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2 ==0)
			{
				evecnt++;
			}
			else
			{
				oddcnt++;
			}
		}
		
		System.out.println("Even "+evecnt+"\nOdd Count "+oddcnt);
	}
}

		
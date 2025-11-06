//8. Count Even and Odd Numbers in an Array

import java.util.*;
public class EvenOddAPP
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] =new int[n];
		System.out.println("enter array element");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();		
		}
		
		int evecount=0;
		int oddcont=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				evecount++;
			}
			else
			{
				oddcont++;
			}
		}
		System.out.println("Even Numbers in array is: "+evecount+" \nOdd Numbers in array is: "+oddcont);
		
	}
}
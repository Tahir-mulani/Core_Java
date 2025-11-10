/*
Q6. Write a Java program to find the kth highest value from an integer array using unsorted array.
Example :
Input: Array : [15, 8, 22, 4, 10, 18] k = 2
Output : 2nd highest value = 18
*/

import java.util.Scanner;
public class Q6HighestValueAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n =sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array Element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter value of k");
		int k=sc.nextInt();
		
		
		
		//sort using bubble sort method
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		int kthmax=a[n-k];
		System.out.print(k +"th Max value is = " +kthmax); 
					
		
	}
}
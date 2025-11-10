/*
Q9. Write a Java program to find the largest missing number from an integer array.
Input Array : arr = {3, 7, 1, 9, 4}
Range: From 1 to 9
All numbers in range: 1 2 3 4 5 6 7 8 9 Present in array: 1 3 4 7 9 Missing numbers: 2, 5, 6, 8
Output : 8 (This is the largest missing number)
*/

import java.util.Scanner;
public class MissingEle
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {3, 7, 1, 9, 4};
	
		
		//sort the array.
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		
		//find max.
		int max=a[a.length-1];
		
		//find missing element.
		int missing []=new int[4];
		for(int j=0,i=1,k=0;i<max;i++)
		{
			if(j<a.length && a[j]==i)
			{
				j++;
			}
			else
			{
				//store int new missing array.
				missing[k]=i; 
				k++;
			}
			
		}
		
		//find largest missing number.
		int large=missing[0];
		for(int i=0;i<missing.length;i++)
		{
			if(missing[i]>large)
			{
				large=missing[i];
			}
		}
		System.out.printf("\n%d",large);
		
			
		
	}
}
				
	
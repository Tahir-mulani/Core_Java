/*
Q7. Write a java program to find perfect number from an array.
Input Array : arr = {2 , 3 , 4, 6 , 7 , 28}
Output : arr = { 6 , 28 }
*/

import java.util.Scanner;
public class PerfectArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4]; //{2 , 3 , 4, 6 , 7 , 28}0
		System.out.printf("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//logic for perfect.
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int sum=0;
			
			// find divisors of number.
			for(int j=1;j<temp;j++) 
			{
				
				if(temp%j==0)        
				{
					// sum divisors of number.
					sum=sum+j;
				}
			}
			
			//comparer with number
			if(sum==a[i])
			{
				System.out.printf("%d\t",a[i]);
			}
		}
	}
}
				
		
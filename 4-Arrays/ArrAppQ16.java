/*Q16. Write a java program to find second highest value of array.
Input : 10 30 50 20 40
Output : 40
*/

import java.util.Scanner;
public class ArrAppQ16
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("Enter Array element");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		int smax=Integer.MIN_VALUE;
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{
				smax=a[i];
			}
			else{
			}
		}
		
		if(smax!=Integer.MIN_VALUE)
		{
			System.out.println("Second max value"+smax);
		}
		else
		{
			System.out.println("There is no second max value");
		}
	}
}
			
	
		
		
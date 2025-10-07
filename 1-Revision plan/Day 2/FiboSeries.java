//8.Write a program using for loop to generate the Fibonacci series up to n terms.
//0 1 1 2 3 5 8

import java.util.*;
public class FiboSeries
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of terms:");
		int n=sc.nextInt();
		int a=0,b=1;
		for(int i=0;i<=n;i++)
		{
			System.out.printf("%d\t",a);
			int sum=a+b;
			a=b;
			b=sum;
		}
	}
}
			
			

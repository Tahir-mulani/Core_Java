//4.Write a program using for loop to display the multiplication table of a given number.

import java.util.*;
public class MultiTabl
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n,mul=0;
		System.out.println("Enter number from keyboard");
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			mul=i*n;
			System.out.printf("%d*%d = %d\n",n,i,mul);
		}
	}
}
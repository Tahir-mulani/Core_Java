//Q4. Write a java program to find even and odd number in array.

import java.util.Scanner;
public class ArrAppQ4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Element");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		//find even odd logic
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.printf("\n%d\teven",a[i]);
			}
			else
			{
				System.out.printf("\n%d\todd",a[i]);
			}
		}
	}
}
		
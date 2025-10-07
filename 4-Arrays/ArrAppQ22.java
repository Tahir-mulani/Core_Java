//Q22. Write a java program to find strong number of a array.

import java.util.Scanner;
public class ArrAppQ22
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
		System.out.println("------------");
		//find strong number logic
		int rem;
		for(int i=0;i<a.length;i++)
		{
			int b=a[i];
			int sum = 0;
				while(b!=0)//123 3*2*1 // 3*2*1// 2*1// 1
				{
					rem=b%10;
					//factorial logic
					int fact = 1;
					while(rem != 0)
					{
						fact = fact * rem;
						rem--;
					}
					b=b/10;
				sum += fact;
				}
			if(sum==a[i])
			{
				System.out.printf("%d\t",a[i]);
			}
		}
	}
}
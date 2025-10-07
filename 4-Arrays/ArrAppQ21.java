//Q21. Write a java program to find duck number of a array.

import java.util.Scanner;
public class ArrAppQ21
{
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		int a[]= new int[5];
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("-----------------");
		//find duck number logic
		int rem;
		for(int i=0;i<a.length;i++)
		{
			int b=a[i];
			boolean flag=false;
			while(b!=0)
			{
				rem=b%10;
				if(rem==0)
				{
					flag=true;
					break;
				}
				b=b/10;
			}
			if(flag)
		{
			System.out.printf("%d\t",a[i]);
		}
		}
	}
				
}

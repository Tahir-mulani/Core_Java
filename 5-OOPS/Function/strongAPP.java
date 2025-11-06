//write a java program to check number is strong number or not strong using function.

import java.util.Scanner;
public class strongAPP
{
	public static int strong(int n)
	{
		int temp=n;
		int count=0;
		int sum=0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		while(n!=0)
		{
			int digit=n%10;
			int p=1;
			for(int i=1;i<=digit;i++)
			{
				p=p*i;
			}
			sum+=p;
			n/=10;
		}
		return sum;
	}
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int result=strong(n);
		if(result==n)
		{
			System.out.println("strong");
		}
		else
		{
			System.out.println("not strong");
		}
	}
}
	

	
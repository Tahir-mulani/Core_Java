//Q2. Write a java program to print 1 to nth happy number.

import java.util.Scanner;

public class HappyNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int n=1 ;n<num;n++)
		{
			boolean flag=false;
			int temp=n;
			while(temp!=1 && temp!=4)
			{
				int sum=0;
				while(temp>0)
				{
					int digit=temp%10;
					sum=sum+(digit*digit);
					temp=temp/10;
				}
				temp=sum;
			}
			if(temp==1)
			{
				System.out.printf("%d\t",n);
				
			}
			
		}
		
	}
}
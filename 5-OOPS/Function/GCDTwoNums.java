//Write a function to find the GCD (HCF) of two numbers.

import java.util.Scanner;
public class GCDTwoNums
{
	public static void main(String x[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		commonFact(a,b);
	}
	public static void commonFact(int a,int b)
	{
		int min=0;
		if(a>b)
		{
			min=b;
		}
		else
		{
			min=a;
		}
		int max=0;
		int i=1;
		while(i<min)
		{
			if(a%i==0 && b%i==0)
			{
				if(i>max)
				{
					max=i;
				}
			}
			i++;
		}
		System.out.printf("Grestest common factor is = %d",max);
				
			
	}
	
}

//Write a function to find the LCM of two numbers using HCF.

import java.util.Scanner;
public class LCMTwoNums
{
	public static void main(String x[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result=LowestCommon(n1,n2);
		System.out.printf("LCM of numbers= %d",result);
	}
	public static int LowestCommon(int n1,int n2)
	{
		int i=1;
		int min=0;
		while(true)
		{
			int tab1 = n1*i;  
			if(tab1%n2==0) 
			{
				return tab1;
			}
			i++;
		}
							
	}
}

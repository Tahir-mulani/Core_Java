//Write a program to calculate the power of a number (x^n) using recursion.

import java.util.Scanner;
public class PowerApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base and Index");
		int base=sc.nextInt();
		int index=sc.nextInt();
		int result = power(base,index);
		System.out.println("Power of Number is : "+result);
		
	}
	public static int power(int base,int index)
	{
		if(index==0) 
		{
			return 1;
		}
		
		return base* power(base,index-1);
	
	}
}

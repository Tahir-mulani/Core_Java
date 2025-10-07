/*
 Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.
*/

import java.util.Scanner;
public class PowerApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		int base = sc.nextInt();
		System.out.println("Enter Index");
		int index = sc.nextInt();
		PowerCalculator p=new PowerCalculator();
		int result=p.getPower(base,index);
	    System.out.println("Power of number is: "+result);
	}
}
class PowerCalculator
{
	int getPower(int base,int index)
	{
		int power=1;
		for(int i=1;i<=index;i++)
		{
			power = base*power;
			
		}
			
		//int power=(int)Math.pow(base,index);
		return power;			
	}
}

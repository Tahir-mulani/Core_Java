/*
Q1. Write program to create class name as Factorial with two functions
       void setValue(int x): this function accept number as parameter
      int getFactorial(): this function can calculate factorial of number and return it.
*/
import java.util.Scanner;
class Factorial
{
	int a;
	public void setValue(int x)
	{
		this.a=x;
	}
	public int getFactorial()
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class FactorialAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		Factorial f1 = new Factorial();
		f1.setValue(n);
		System.out.println("Factorial of Given Number is = "+(f1.getFactorial()));
		
	}
}
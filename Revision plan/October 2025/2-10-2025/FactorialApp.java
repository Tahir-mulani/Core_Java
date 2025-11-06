/*Q2. Write program to create class name as Factorial with two functions
 void setValue(int x): this function accept number as parameter
 int getFactorial(): this function can calculate the factorial of a number and return it.
*/

import java.util.*;
class Factorial
{
	int n;
	public void setValue(int x)
	{
		n=x;
	}
	public int getFactorial()
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class FactorialApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Factorial f = new Factorial();
		System.out.println("Enter number");
		int a=sc.nextInt();
		f.setValue(a);
		System.out.println("Factprial of "+a+" is " +f.getFactorial());
		
		
		
	}
}
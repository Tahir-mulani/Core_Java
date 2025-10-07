/*2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/

import java.util.Scanner;
class operation
{
	void add(int a,int b)
	{
		System.out.println("Addition is:"+(a+b));
	}
	void sub(int a,int b)
	{
		System.out.println("Subtraction is:"+(a-b));
	}
	void mul(int a,int b)
	{
		System.out.println("Multiplication is:"+(a*b));
	}
	void divide(int a,int b)
	{
		System.out.println("Divide is:"+(a/b));
	}
	void mod(int a,int b)
	{
		System.out.println("Modolus  is:"+(a%b));
	}
		
		
}

public class CalculatorApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		operation obj = new operation();
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.add(a,b);
		obj.mul(a,b);
		obj.divide(a,b);
		obj.mod(a,b);
		
	}
}
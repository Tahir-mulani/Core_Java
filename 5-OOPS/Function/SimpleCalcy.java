/*Simple Calculator using Functions
Write separate functions:
add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)
divide(int a, int b)
*/

import java.util.*;
public class SimpleCalcy
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter choice");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			add(a,b);
			break;
			
			case 2:
			subtract(a,b);
			break;
			
			case 3:
			multiply(a,b);
			break;
			
			case 4:
			divide(a,b);
			break;
			
			default:
			System.out.println("wrong choice");
			
		}
		
	}
	public static void  add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void subtract(int a,int b)
	{
		int subtract=a-b;
		System.out.println(subtract);
	}
	public static void multiply(int a,int b)
	{
		int multiply=a*b;
		System.out.println(multiply);
	}
	public static void divide(int a,int b)
	{
		int divide=a/b;
		System.out.println(divide);
	}
}
	
	
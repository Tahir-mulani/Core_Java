/*Check Even or Odd
Write a function isEven(int n) that returns true if the number is even, otherwise false.
Test the function with user input.
*/

import java.util.*;
public class EvenOdd
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		String result = isEven(n);    //function calling
		System.out.println(result);
	}
	public static String isEven(int n)    //defination of function
	{
		if(n%2==0)
		{
			return "Even";
		}
		else
		{
			return "Odd";
		}
	}
		
}
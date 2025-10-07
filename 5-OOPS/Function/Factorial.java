/*Calculate Factorial
write a function factorial(int n) that returns the factorial of a given number.
Call it from main() and display the factorial.
*/

import java.util.*;
public class Factorial
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int result = factorial(n);;
		System.out.println("Facotrial is:" +result);
		
	}
	public static int factorial(int n)
	{
		
		int f=1;
		while(n!=0)
		{
			f=f*n;
			--n;
		}
		return f;
	}
}
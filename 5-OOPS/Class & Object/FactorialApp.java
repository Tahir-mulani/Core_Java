/*Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.
*/

import java.util.Scanner;
public class FactorialApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		FactorialCalculator fc = new FactorialCalculator();
		int result = fc.findFactorial(n);
		System.out.println("Factorial of number is : "+result);
	}
}
class FactorialCalculator
{
	int findFactorial(int n)
	{
		
		int fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		return fact;
	}
}
	
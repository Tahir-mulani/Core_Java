/*Sum of Digits
write a function sumOfDigits(int n) that calculates and returns the sum of digits of a given number.
Example: Input 123 → Output: 6.
*/

import java.util.*;
public class SumDigit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		
		int result = sumOfDigits(n);
		System.out.println(result);
	}
	public static int sumOfDigits(int n)
	{
		int sum=0,rem;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
}
		
   
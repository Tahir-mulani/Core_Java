//Q43. Write a Java program to find the largest and smallest digit of a given number.
import java.util.*;
public class Q43Largest_Smallest_Digit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n,max,min;
		System.out.println("enter number");
		n=sc.nextInt();
		max=0;
		min=9;
		while(n>0)
		{
			int digit=n%10;
			if(digit>max)
			{
				max=digit;
			}
			if(digit<min)
			{
				min=digit;
			}
			n=n/10;
		}
		System.out.println("Maximum digit is:"+max);
		System.out.println("Minimum digit is:"+min);
	}
}
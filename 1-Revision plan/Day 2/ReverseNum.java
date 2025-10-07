//6.Write a program using for loop to reverse a given number.

import java.util.*;
public class ReverseNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number form keyboard");
		int n=sc.nextInt();
		int rem=0,rev=0;
		for(;n!=0; )
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;			
		}
		System.out.printf("after Reverse number is : %d",rev);
	}
}
			
//5.Write a program using for loop to count the number of digits in a given number.

import java.util.*;
public class CountDigit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter number from keyboard");
		num=sc.nextInt();
		int i;
		for(i=0;num!=0;i++)
		{
			num=num/10;
			
		}
		System.out.printf("the number digits in number is: %d",i);
	}
}
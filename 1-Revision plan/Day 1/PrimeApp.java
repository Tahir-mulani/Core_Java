//9.Write program to check if the number is prime or not?

import java.util.Scanner;
public class PrimeApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number");
		n=sc.nextInt();
		int count=0,i=1;
		
		//prime number logic.
		while(i<=n)
		{
			//calculate divisible numbers.
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		String str=(count==2)? "Prime number":"not prime number";
		System.out.println(str);
	}
}

//5.Write program to input number and check number is perfect or not?

import java.util.Scanner;
public class PerfectApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number");
		n=sc.nextInt();
		
		int sum=0,i=1;
		//perfect number logic
		while(i<n)
		{
			//find factorial
			if(n%i==0) 
			{
				sum=sum+i;
			}
			i++;
		}
		String str=(n==sum)? "perfect number":"not perfect number";
		System.out.println(str);
	}
}
	
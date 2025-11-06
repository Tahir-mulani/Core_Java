//6.Write program to input number and check number is duck or not?

import java.util.Scanner;
public class DuckApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number: ");
		n=sc.nextInt();
		
		boolean flag=false;
		//duck number logic
		while(n!=0)
		{
			//extract element
			int rem=n%10; 
			if(rem==0)
			{
				flag=true;
				break;
			}
			n=n/10;
		
		}
		
		if(flag)
		{
			System.out.println("duck number");
		}
		else
		{
			System.out.println("Not duck number");
		}
	}
}
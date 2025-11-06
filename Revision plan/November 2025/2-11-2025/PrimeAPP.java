//9.Write program to check number is prime or not?
import java.util.Scanner;
public class PrimeAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}
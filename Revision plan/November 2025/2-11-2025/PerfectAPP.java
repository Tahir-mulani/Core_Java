//5.Write program to input number and check number is perfect or not?
import java.util.Scanner;
public class PerfectAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
	
		for(int i=1;i<=n;i++)
		{
			if(i%n==0)
			{
				sum+=i;
			}
		}
		if(n==sum)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("not perfect");
		}
	}
}
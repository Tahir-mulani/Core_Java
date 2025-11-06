//9.Write a program using for loop to print all prime numbers between 1 and 100.


public class PrimeNum
{
	public static void main(String x[])
	{
		for(int n=2;n<=100;n++)
		{
			boolean flag=true;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(n);
			}
		}
	}
}
	
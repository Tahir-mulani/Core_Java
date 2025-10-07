//10.Write a program using nested for loops to print a pyramid star pattern.

public class PyramidStar
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=11;j++)
			{
				if(j>=7-i && j<=i+5)
				{
					System.out.printf("*");
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}
			
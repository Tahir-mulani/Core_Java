/*
1
12
1 3
1  4
12345

*/
public class Pattern11
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1 || i==5 || i==j)
				{
					System.out.printf("%d",j);
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
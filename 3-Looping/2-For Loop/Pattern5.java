/*
	* * * * *
	*     *
	*   *
	* *
	*
*/
public class Pattern5
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{	
			for(int j=1;j<=6;j++)
			{				
				if(i==1||j==1|| i+j==7)
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

				
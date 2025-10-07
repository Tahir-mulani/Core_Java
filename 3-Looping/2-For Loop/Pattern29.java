/*
   *        *
   **      **
   ***    ***
   ****  ****
   **********
   **********
   ****  ****
   ***    ***
   **      **
   *        *
*/
public class Pattern29
{
	public static void main(String x[])
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if((j<=i || j>=11-i) && i<=5)
				{
					System.out.printf("*");
				}
				else if((j<=11-i || j>=i) && i>5)
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
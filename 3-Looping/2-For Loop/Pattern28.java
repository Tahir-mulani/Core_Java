/*
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 *        *
 **      **
 ***    ***
 ****  ****
 **********
*/
public class Pattern28
{
	public static void main(String x[])
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j<7-i || j>4+i && i<=6 )
				{
					System.out.printf("*");
				}
				else if(j<i-4 || j>15-i && i>5)
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
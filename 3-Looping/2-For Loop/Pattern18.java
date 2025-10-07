/*
 ********1********
 *******2*2*******
 ******3*3*3******
 *****4*4*4*4*****
 ****5*5*5*5*5****
*/
public class Pattern18
{
	public static void main(String x[])
	{
		for(int i=1 ;i<=5;i++)
		{
			boolean flag=true;
			for(int j=1;j<=17;j++)
			{
				if(j<=8+i && j>=10-i && flag)
				{
					System.out.printf("%d",i);
					flag=false;
				}
				else
				{
					System.out.printf("*");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}
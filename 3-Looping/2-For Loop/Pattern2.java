/*
	*****
	*   *
	*****
*/
public class Pattern2
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=5;j++)
			{
				String msg=((i==2 && j==2)||(i==2&&j==3)||(i==2&&j==4))? " ":"*";
				System.out.printf(msg);
				
			}
			System.out.printf("\n");
		}
	}
}
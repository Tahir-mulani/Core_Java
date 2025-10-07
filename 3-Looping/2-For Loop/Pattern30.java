  /*
	*******
	**   **
	* * * *
	*  *  *
	* * * *
	**   **
	*******
	*/
public class Pattern30
{
	public static void main(String x[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j==1||i==1 || i==7 || j==7)
				{
					System.out.printf("*");
				}
				else if(j==8-i || j==i)
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
/*
12345
2345
345
45
5
*/
public class Pattern10
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<=j)
				{
					System.out.printf("%d",j);
				}
			}
			System.out.printf("\n");
		}
	}
}
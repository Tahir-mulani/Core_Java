/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
*/
public class PatternPascal27
{
	public static void main(String x[])
	{
		int c=0;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0||i==0)
				{
					c=1;
				}
				else
				{
					c=(c*(i-j+1))/j;
				}
				System.out.printf("%d ",c);
			
			}
			System.out.printf("\n");
		}
	}
}
/*
123454321
1234321
12321
121
1
*/
public class Pattern39
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			int count=1;
			for(int j=1;j<=9;j++)
			{
				if(j<=11-(2*i))
				{
					System.out.print(count);
					if(j<6-i)
					{
						count++;
					}
					else
					{
						count--;
					}
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

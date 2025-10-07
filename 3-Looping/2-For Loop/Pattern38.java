/*
  1        1
  12      21
  123    321
  1234  4321
  1234554321
*/

public class Pattern38
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				
				if(i>=j)
				{
					System.out.printf("%d",j);
				}
				else if(j>=11-i)
				{
					System.out.printf("%d",(10-j+1));
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
/*
1
2 * 2
3 * 3 * 3
4 * 4 * 4 * 4
3 * 3 * 3
2 * 2
1
*/
public class Q3
{
	public static void main(String x[])
	{
		int n=1;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(j<=i && i<=3)
				{
					System.out.print(i);
					if(j%2==0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("*");
					}
						
					
				}
				else if(j<=9-i && i>=4)
				{
					System.out.print(8-i);
					if(j%2==0 && j<7)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("*");
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

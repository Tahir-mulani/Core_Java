/*
1
2*3
4*5*6
7*8*9*10
7*7*7*7
8*8*8
9*9
10
*/
public class Pattern24
{
	public static void main(String x[])
	{
		int i,j,count=1;
		for(i=1;i<=8;i++)
		{
			for(j=1;j<=7;j++)
			{
				if(j<=(2*i)-1 && i<=4)
				{
					if(j%2==0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(count++);					
					}
				}
				else if(j<=17-(2*i) && i>=5)
				{
					if(j%2==0)
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(i+2);
					}
				}
				
			}				
			System.out.printf("\n");
		}
	}
}

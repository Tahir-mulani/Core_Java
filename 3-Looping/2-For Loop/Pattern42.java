/*
A
BAB
CBABC
DCBABCD
EDCBABCDE
*/
public class Pattern42
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			int a=i+64;
			for(int j=1;j<=9;j++)
			{
				if(j<=(2*i)-1)
				{
					
					System.out.printf("%c",(char)a);
					
					if(j<i)
					{
						a--;
					}
					else
					{
						a++;
					}
						
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
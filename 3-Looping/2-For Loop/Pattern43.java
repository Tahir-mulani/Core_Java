/*
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
*/
public class Pattern43
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1,count=1;j<=9;j++)
			{
				if(j<=(2*i)-1)
				{
					System.out.printf("%c",(char)count+64);
					if(j<i)
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
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
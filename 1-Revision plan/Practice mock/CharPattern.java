/*Q5.Write a java program to print this pattern.
A
A B A
A B C B A
A B C D C B A
A B C D E D C B A
*/

public class CharPattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			for(int j=1;j<=9;j++)
			{
				if(j<=4+i && j>=6-i)
				{
					System.out.printf("%c",ch);
					if(j<5)
					{
						ch++;
					}
					else
					{
						ch--;
					}
				}
				else
				{
					System.out.printf("");
					
				}
			}
			System.out.printf("\n");
		}
	}
}

					
		
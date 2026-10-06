//Write a java program to print this pattern.
/*
    A
   ###
  ABCBA
 #######
ABCDEDCBA
 #######
  ABCBA
   ###
    A

*/
public class PatternAPP
{
	public static void main(String x[])
	{
		for(int i=1;i<=9;i++)
		{
			int  ch = 65;
			for(int j=1;j<=9;j++)
			{
				if((i<=5 && (i+j) >= 6 && (i+4) >= j)||(i>5 && (i-4)<=j && (14-i)>=j))
				{
					if(i%2 == 0)
					{
						System.out.print("#");
					}
					else
					{
						if(j<5)
						{
							System.out.print((char)ch++);
						} else{
							System.out.print((char)ch--);
						}
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
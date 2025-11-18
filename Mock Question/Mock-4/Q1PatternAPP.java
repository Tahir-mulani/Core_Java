/*
Q1. Write a java program to print this pattern.
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
*/

public class Q1PatternAPP
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{	
				if(6-i==j || 4+i==j)
				{
					System.out.print("1");
				}
				else if(j==5 && i==3)
				{
					System.out.print("2");
				}
				else if((j==4||j==6 )&&i==4)
				{
					System.out.print("3");
				}
				else if( i==5 &&(j==7|| j==3))
				{
					System.out.print("4");
				}
				else if(j==5 && i==5)
				{
					System.out.print("6");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}



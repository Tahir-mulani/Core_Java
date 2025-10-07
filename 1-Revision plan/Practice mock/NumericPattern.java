/*
Q6.Write a java program to print this pattern.
 1  2  3  4  5
10  9  8  7  6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25
*/

public class NumericPattern
{	
	public static void main(String x[])
	{
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i%2!=0)
				{
					System.out.printf("%d\t",n++);
				}
				else
				{
					System.out.printf("%d\t",n);
				}
			}
			System.out.printf("\n");
		}
	}
}
					
	
/*
Section -A
Q1. Write a java program to print this pattern.
1
3 3 3
5 5 5 5 5
3 3 3
1
*/
public class Pattern1APP
{
	public static void main(String x[])
	{
		int num = 1;
		int n = 5;
		for(int i=1; i<=5 ; i++)
		{
			for(int j=1; j<=5; j++)
			{
				
				if(j <= i*2 - 1 && i <= 3)
				{
					System.out.print(num+" ");
				}
				else if(j<= (2*(n-i + 1) - 1) && i>3)
				{	
					 
					System.out.print(num+" ");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			if(i<3)
			{
				num += 2;
			}
			else{
				num-=2;
			}
			System.out.println();
		}
	}
}
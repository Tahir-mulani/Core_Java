/*Write a java program to print this pattern.

 *      *
  *    *
   *  *
	 *
	* *
   *   *
  *     *
 *       *

*/


public class Pattern
{
	public static void main(String x[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if((j==i|| j==10-i )&& i<=5)
				{
					System.out.printf("*");
				}
				else if((j==10-i || i==j )&& i>5)
				{
					System.out.printf("*");
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
			

 
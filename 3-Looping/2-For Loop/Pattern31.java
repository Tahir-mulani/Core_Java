/*
    *
   ***
  * * *
 *  *  *
*********
 *  *  *
  * * *
   ***
    *

*/
public class Pattern31
{
	public static void main(String x[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				//using ternary operator
				String s=((j==6-i || j==4+i)&& i<=5)? "*":((j==i-4 || j==14-i) && i>5)? "*":(j==5 || i==5)? "*":" ";
				System.out.print(s);
				/*
				if((j==6-i || j==4+i)&& i<=5)
				{
					System.out.printf("*");
				}
				else if((j==i-4 || j==14-i) && i>5)
				{
					System.out.printf("*");
				}
				else if(j==5 || i==5)
				{
					System.out.printf("*");
				}
				else
				{
					System.out.printf(" ");
				}
				*/
			}
		    System.out.printf("\n");
		}
	}
}
			
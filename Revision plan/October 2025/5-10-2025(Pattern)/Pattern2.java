/*
    1
   1 1
  1   1
 1     1
1 2 3 4 1
*/
public class Pattern2
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{   int count=1;
			for(int j=1;j<=9;j++)
			{
				if(j==4+i || j==6-i)
				{
					System.out.print("1");
				}
				else if(i==5 && j%2!=0)
				{
					System.out.print(j-count);
					count++;
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
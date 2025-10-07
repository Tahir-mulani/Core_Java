/* 
    1
   121
  12321
 1234321
123454321

*/
public class Pattern17
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{	
			int count=1;
			for(int j=1;j<=9;j++)
			{
				if(j<=4+i && j>=6-i)
				{
					System.out.printf("%d",count);
					if(j<5)
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
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}
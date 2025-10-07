/*
    1
   232
  34543
 4567654
567898765

*/
public class Pattern12
{
	public static void main(String x[])
	{
		for(int i=1;i<=5;i++)
		{
			int count=i;
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
				
/*  
  3
  44
  555
  6666
  555
  44
  3
*/
public class Pattern22
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1;i<=7;i++)
		{
			for(j=1;j<=4;j++)
			{
				if(i>=j && i<5)
				{
					System.out.printf("%d",2+i);
				}
				else if(j<9-i && i>4)
				{
					System.out.printf("%d",10-i);					
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
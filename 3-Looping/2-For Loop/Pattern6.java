//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *
public class Pattern6
{
	public static void main(String x[])
	{
		int i,j;
		for(i=1;i<=6;i++)
		{	
			boolean flag=true;
			for(j=1;j<=11;j++)  
			{
				
				if( j<= 5+i && j>=7-i && flag)
				{
					System.out.printf("*");
					flag=false;
				}
				else
				{
					System.out.printf(" ");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}
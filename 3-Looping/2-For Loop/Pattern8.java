//      *      
//     * *     
//    *   *    
//   *     *   
//  *       *  
// * * * * * *          

public class Pattern8
{
	public static void main(String x[])
	{
		for(int i=1;i<=6;i++)
		{
			boolean flag=false;
			for(int j=1;j<=11;j++)
			{
				if(j==5+i || j==7-i)
				{
					System.out.printf("*");
				}
				else if(i==6)
				{
					if(flag)
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
				else{
					System.out.printf(" ");
				}
			}
			System.out.printf("\n");
		}
	}
}
/*
    ****
   *  *
  *  *
 ****
*/
public class Pattern35
{
	public static void main(String x[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
				String s=((i==1 && j>=4)||(i==2 && (j==3 || j==6))||(i==3 &&(j==2 || j==5))||(i==4 && j<=4))? "*":" ";
				System.out.print(s);
			}
			System.out.printf("\n");
		}
	}
}

			
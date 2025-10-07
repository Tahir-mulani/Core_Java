/*
    *
     *
      *
       *
*********
       *
      *
     *
    *
*/
public class Pattern32
{
	public static void main(String x[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				String s=( (i==5|| j==i+4) && i<=5)? "*":(j==14-i && i>5)? "*":" ";
				System.out.printf(s);
			}
			System.out.printf("\n");
		}
	}
}

	
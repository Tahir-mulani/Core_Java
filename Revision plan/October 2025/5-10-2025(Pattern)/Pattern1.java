/*
         1
       A   B
     2       3
   B           C
 4   5   6   7   8
*/
public class Pattern1
{
	public static void main(String x[])
	{
		int count=1;
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			if(i==4)
				ch='B';
		
			for(int j=1;j<=9;j++)
			{
				
				if(i%2!=0)
				{
					if(j==4+i || j==6-i || (i==5 && j%2==1))
					{
						System.out.print(" "+(count++));
					}
					else
					{
						System.out.print("  ");
					}
				}
				else 
				{
					if(j==6-i || j==4+i )
					{
						System.out.print(" "+(ch++));
					}
					else
					{
						System.out.print("  ");
					}
				}				
			}
			System.out.print("\n");
		}
	}
}
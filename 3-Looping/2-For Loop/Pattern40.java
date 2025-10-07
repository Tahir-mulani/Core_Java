/*A
  B C
  D E F
  G H I J
  K L M N O
*/
public class Pattern40
{
	public static void main(String x[])
	{
		
		for(int i=1,a=65;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.printf("%c",(char)a++);
					
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
				
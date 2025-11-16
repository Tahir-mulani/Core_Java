/*Q1. Write a java program to print this pattern.
1
2 * 2
3 * 3 * 3
4 * 4 * 4 * 4
3 * 3 * 3
2 * 2
1
*/

public class Q1PatternAPP
{
	public static void main(String x[])
	{ 
		for(int i=1;i<=7;i++)
		{
			int num=(i<=4)? i:8-i;
			int count=num;
			for(int j=1;j<=count;j++)
			{
				System.out.print(num);
				if(j!=count){
					System.out.print(" * ");
				}
				
			}
			System.out.print("\n");
		}
		
	}
}
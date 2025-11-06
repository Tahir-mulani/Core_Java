/*Q4.write a java program to display following using function recursion.
1 4 9 16 25 36 49 64 81 100 */

public class Q4SeriesAPP
{
	public static void main(String x[])
	{
		int firstTerm=1;
		int diff=3;
		int n=10;
		series(firstTerm,diff,n);
		
	}
	public static void series(int firstTerm,int diff,int terms)
	{
		if(terms==0)
			return;
		
		System.out.print(firstTerm+" ");
		series(firstTerm+diff,diff+2,terms-1);
	}
}
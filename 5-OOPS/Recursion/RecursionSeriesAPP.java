/*
Section-A
Q4. Write a Java program to display the following series using function recursion.
7 10 15 22 31 42 55 70
*/
public class RecursionSeriesAPP
{
	public static void main(String x[])
	{	
		int firstTerm = 7;
		int diff = 3;
		
		recursion(firstTerm,diff);
	}
	public static void recursion(int firstTerm,int diff)
	{
		if(diff>18) return ;
		
		System.out.print(firstTerm +" ");
		
		recursion(firstTerm+diff,diff+2);
	}
}
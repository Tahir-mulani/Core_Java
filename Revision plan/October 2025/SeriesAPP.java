/*
Write a Java program to display the following series using function recursion :
7 10 15 22 31 42 55 70
*/

public class SeriesAPP
{	
	static void  printSeries(int current,int diff,int n)
	{
		if(n==0)   //base case
			return;
			
		System.out.print(current+" ");
		printSeries(current+diff,diff+2,n-1);
	}

	public static void main(String x[])
	{	
		int first =7;
		int diff =3;
		int terms =8;
		System.out.println("Series");
		printSeries(first,diff,terms);
		
	}
}
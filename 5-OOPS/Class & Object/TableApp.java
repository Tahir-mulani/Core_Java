/*
Generate Multiplication Table
Create a class MultiplicationTable with a method printTable to print the table of a given number.
Explanation: Explains nested loops and formatted printing.
*/

import java.util.Scanner;
public class TableApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.printf("Print table of %d\n",n);
		MultiplicationTable tab=new MultiplicationTable();
		tab.printTable(n);
		
		
	}
}
class MultiplicationTable
{
	void printTable(int n)
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
}
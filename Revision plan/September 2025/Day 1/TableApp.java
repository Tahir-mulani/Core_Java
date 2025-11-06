//4.Write a program to input numbers and print its table?

import java.util.Scanner;
public class TableApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number");
		n=sc.nextInt();
		System.out.println("=======================");
		int sum=0,i=1;
		while(i<=10)
		{
			int table= (sum+i)*n;
			System.out.println(table);
			i++;
			
		}
		
	}
}

			
		
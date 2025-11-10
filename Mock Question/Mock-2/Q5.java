/*Q5. Write a Java program to display the following series using function :
3 6 12 24 48 96 192
(Each term doubles from the previous term starting at 3).
*/

import java.util.Scanner;
public class Q5
{	
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		
		//input start term from user.
		System.out.println("enter start term"); 
		int n=sc.nextInt();
		
		//first term.
		
		int a=3;
		
		//logic print series up to nth term
		while(a<=192)
		{
			System.out.printf("%d\t",a);
			int mul=a*2;   //each term double fro privious.
			a = mul;    //value assian to the a.
		}
		
	}
}
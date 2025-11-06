//4.Write a program to input number and print its table?
import java.util.Scanner;
public class TableAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int i=1;
		while(i<11)
		{
			int tab=n*i;
			System.out.println(tab);
			i++;
		}
	}
}
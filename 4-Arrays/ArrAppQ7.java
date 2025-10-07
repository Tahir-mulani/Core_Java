//Q7. Write a java program to display the reverse array.

import java.util.Scanner;
public class ArrAppQ7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array Element Before Reverse");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.printf("\nDisplay Array Element After Reverse");
		for(int i=(a.length-1);i>=0;i--)
		{
			System.out.printf("%d\t",a[i]);			
		}
	}
}

		
		
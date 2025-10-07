//Q13. Write a java program to copy one array to another array.

import java.util.Scanner;
public class ArrAppQ13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		//enter Array Element
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//display Array element
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(i<b.length)
			b[i]=a[i];
			System.out.printf("%d\t",b[i]);
			 
		}
		
	}
}
	


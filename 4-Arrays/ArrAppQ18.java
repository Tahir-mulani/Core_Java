//Q18. Write a java program to remove duplicates values of array.

import java.util.Scanner;
public class ArrAppQ18
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[a.length];
		int size=0;
		
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//check duplicates
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					flag=true;
					System.out.printf("(%d,%d)",a[i],a[j]);
					break;
				}
			}
			if(flag)
			{
				System.out.printf("%d\t",a[i]);
			}
			else
			{
				System.out.println("No Duplicate");
			}
		}
		
		
	}
}
		
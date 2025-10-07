// Write a program to create an array of size 10 and find occurrences of every element in the array?

import java.util.*;
public class ArrOccuranceEveryEleAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n =sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	
		
		boolean flag []= new boolean[n];
		for(int i=0;i<n;i++)
		{
			int count=1;
			if(flag[i]) continue;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					flag[j]=true;
					count++;
				}
			}
			System.out.println(a[i]+"--->"+count);
		}		
	}
}
			
		
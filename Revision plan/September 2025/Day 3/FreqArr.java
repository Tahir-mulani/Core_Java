//4.Write a program to find the frequency of each element in an array.

import java.util.*;
public class FreqArr
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//find frequency logic.
		boolean visited[]= new boolean[n];
		
		for(int i=0;i<a.length;i++)
		{
			if(visited[i])
			{
			 continue;
			}
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					visited[j]=true;
				}
			}
			System.out.printf("%d = %d\n",a[i],count);
		}	
	}
}
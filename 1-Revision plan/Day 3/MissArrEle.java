//6.Write a program to find the missing number in an array of n consecutive integers.


import java.util.*;
public class MissArrEle
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
		
		//missing logic.
		int missing =-1;
		for(int i=0;i<a.length-1;i++)
		{
			if((a[i+1]-a[i])!=1)
			{
				missing =a[i]+1;
				break;
			}
		}
		
		if(missing !=-1)
		{
			System.out.printf("%d\t",missing);
		}
		else
		{
			System.out.printf("\nNot missing element");
		}
	}
}
	
	
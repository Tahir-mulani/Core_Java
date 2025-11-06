//3.Write a program to check if two arrays are equal (same elements in the same order).


import java.util.*;
public class CheckArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		//check element
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				{
					flag=false;
					break;
				}
		}
		String str=(flag)? "array are equal":"Array are not  equal";
		System.out.println(str);	
	}
}

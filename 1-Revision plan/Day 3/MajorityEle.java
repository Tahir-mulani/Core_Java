//10.Write a program to find the majority element (element appearing more than n/2 times) in an array.

import java.util.*;
public class MajorityEle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter array size");
		n=sc.nextInt();
		
		int a[] = new int [n];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//sort arry.
		Arrays.sort(a);
		for(int element:a)
		{
			System.out.printf("%d\t",element);
		}
		
		//majority logic.
		int count=1;
		boolean flag=false;
		for(int i=1;i<a.length-1;i++)
		{
			
			if(a[i]==a[i-1])
			{
				count++;
			}
			else
			{
				count=1;
			}
			
			if(count>n/2)
			{
				flag=true;
				System.out.printf("Majority Element :%d\t",a[i]);
				break;
			}
			
		}
		if(!flag)
		{
			System.out.printf("not found");
		}
		
	}
}
		
//Q23. Write a java program to find armstrong number of a array.

import java.util.*;
public class ArrAppQ23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit for an array");
		int n=sc.nextInt();
		int a[] = new int [n];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//find armstrong logic
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			int num=a[i];
			while(num>0)
			{
				num=num/10;
				count++;
			}
			num=a[i];
			int sum=0,rem,pow=0;
			while(num!=0)
			{
				rem=num%10;
				pow=(int)Math.pow(rem,count);
				sum+=pow;
				num=num/10;
			}
			if(a[i]==sum)
			{
				System.out.printf("%d\t",a[i]);
			}
		}
	}
}	
			
			
			
		
		
		
		
			
			
		
		
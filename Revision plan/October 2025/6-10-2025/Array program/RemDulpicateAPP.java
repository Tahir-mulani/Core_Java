//10. Remove Duplicate Elements from Array

import java.util.*;
public class RemDulpicateAPP
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int duplicate[] = new int[n];
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])   //duplicate found
				{
					flag=true;
					break;					
				}
			}
			if(!flag)    //If element is not duplicated later, store it in duplicate[].
			{
				duplicate[count]=a[i];
				count++;
			}
				
		}
		for(int i=0;i<count;i++)
		{
			System.out.printf("%d ",duplicate[i]);
		}
				
	}
}
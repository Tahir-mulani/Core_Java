//Write program to create array of size 5 and input search key value and search value in array

import java.util.*;
public class SearchKeyAPP
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
		System.out.println("Enter search key");
		int skey=sc.nextInt();
		int index = search(a,skey);
		if(index!=-1)
		{
			System.out.println("Value found there index is: "+index);
		}
		else
		{
			System.out.println("Value not found");
		}
	}
	public static int search(int m[],int skey)
	{
		int index=-1;
		for(int i=0;i<m.length;i++)
		{
			if(m[i]==skey)
			{
				index=i;
				break;
			}
		}
		return index;
	}
}
			
		
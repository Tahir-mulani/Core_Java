/*
7.Find Majority Element (Occurs > n/2 Times)
Concept: Use count method or Boyer-Moore Voting Algorithm.
 Use Case: Identify the dominating product, preference, etc.
Inut : arr = [2, 2, 1, 1, 2, 2, 2]
Size (n) = 7
Majority element is: 2
*/

import java.util.Scanner;
class MajorityElementArray
{
	int []a;
	MajorityElementArray(int a[])
	{
		this.a=a;
	}
	public void  MajorityElement()
	{
		
		for(int i=0;i<a.length;i++)
		{int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>a.length/2)
			{
				System.out.println("Majority element is: "+a[i]);
			}
		}
	}
}
public class MajorityElementArrayAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array length");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter Array Element");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		MajorityElementArray m = new MajorityElementArray(a);
		m.MajorityElement();
		
		
	}
}
		
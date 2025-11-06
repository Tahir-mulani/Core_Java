/*
8. Rearrange Array in Alternate Positive and Negative Items
Concept: Use auxiliary arrays or index manipulation to interleave.
 Use Case: Alternate scheduling, balancing data flow.
Input: arr = [2, 3, -4, -1, 6, -9]

Separate positives: [2, 3, 6]
Separate negatives: [-4, -1, -9]
Rearranged array: [2, -4, 3, -1, 6, -9]
*/

import java.util.Scanner;
class RearrangeElementArray
{
	int []a;
	RearrangeElementArray(int a[])
	{
		this.a=a;
	}
	public void RearrangeElement()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				
		}
	}
}
public class RearrangeElementArrayAPP
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
		

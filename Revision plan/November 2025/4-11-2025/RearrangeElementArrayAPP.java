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
		//seperate positive and negative elements
		int n=a.length;
		int []positives=new int[n];
		int[]negatives = new int[n];
		int p=0,ne=0;
		
		//seperate element into two arrays
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=0)
				positives[p++]=a[i];
			else
				negatives[ne++]=a[i];				
		}
		
		//rearrange alternately
		int i=0,j=0,k=0;
		boolean flag =true;  //start with positive.
		
		while(i<p && j<ne)
		{
			if(flag)
				a[k++]=positives[i++];
			else
				a[k++]=negatives[j++];
			flag = !flag;
		}
		
		//add remaining elements
		while(i<p)
			a[k++]=positives[i++];
		while(j<ne)
			a[k++]=negatives[j++];
		
		//print the rearranged array
		System.out.println("Rearranged array:");
		for(int val:a)
			System.out.print(val+" ");
		
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
		RearrangeElementArray m = new RearrangeElementArray(a);
		m.RearrangeElement();
		
		
	}
}
		

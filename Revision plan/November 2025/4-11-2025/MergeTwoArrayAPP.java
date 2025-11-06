/*
Q5. Write program to create class name as MergeTwoArray with parameterized constructor
      MergeTwoArray(int [],int []): this constructor accept two array as parameter
      int [] getMergeArray(): this function merge two array in third array and return new merged    array
*/

import java.util.Scanner;
class MergeTwoArray
{
	int []a1,a2,a3;
	MergeTwoArray(int a1[],int a2[])
	{
		this.a1=a1;
		this.a2=a2;
	}
	int[]getMergeArray()
	{
		int[]a3=new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++)
		{
			a3[i]=a1[i];
		}
		int j=0;
		for(int i=a1.length;i<a3.length;i++)
		{
			a3[i]=a2[j];
			j++;
		}
		return a3;
	}
}
public class MergeTwoArrayAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array length");
		int n1=sc.nextInt();
		System.out.println("Enter Array Length");
		int n2=sc.nextInt();
		int a1[]=new int[n1];
		int a2[]=new int[n2];
		System.out.println("Enter Array Element");
		for(int i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter Array Element");
		for(int i=0;i<n2;i++)
		{
			a2[i]=sc.nextInt();
		}
		MergeTwoArray m = new MergeTwoArray(a1,a2);
		int arr[]=m.getMergeArray();
		System.out.println("Merged Array");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
	}
}
		
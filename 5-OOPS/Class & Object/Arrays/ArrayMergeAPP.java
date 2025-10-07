/*
Q9. Merge Two Arrays
Class: ArrayMerge
Functions:
void inputArray(int arr1[], int arr2[])
int[] mergeArrays()
Logic: Create new array of size arr1.length + arr2.length and copy both arrays into it.
*/
import java.util.*;
class ArrayMerge
{
	int a[];
	int b[];
	int c[];
	void inputArray(int arr1[],int arr2[],int merge[])
	{
		a=arr1;
		b=arr2;
		c=merge;
	}
	int [] mergeArrays()
	{
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		return c;
	}
	
}
public class ArrayMergeAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		
		
		int arr1[]= new int[n];
		int arr2[]=new int[n];
		int merge[]= new int[arr1.length+arr2.length];
		
		System.out.println("Enter array Elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		ArrayMerge a1 = new ArrayMerge();
		a1.inputArray(arr1,arr2,merge);
		int result[]=a1.mergeArrays();
		
		Arrays.sort(result);
		
		System.out.println("Array After Merge");
		for(int i=0;i<result.length;i++)
		{
			System.out.printf("%d\t",result[i]);
		}
	}
}
		
		
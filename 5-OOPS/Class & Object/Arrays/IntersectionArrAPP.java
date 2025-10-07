/*
Q15.Find Intersection of Two Arrays
Class: ArrayIntersection
Functions:
void inputArrays(int arr1[], int arr2[])
void findIntersection()
Logic:
Compare elements of arr1 with arr2.
If common element found, print it (but avoid duplicates).
*/

import java.util.Scanner;
class ArrayIntersection
{
	int a[];
	int b[];
	void inputArrays(int arr1[],int arr2[])
	{
		a=arr1;
		b=arr2;
	}
	void findIntersection()
	{
		int m;
		if(a.length<b.length)
		{
			m=a.length;
		}
		else
		{
			m=b.length;
		}
		int intersection[]=new int[m];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				
				if(a[i]==b[j])
				{
					boolean flag=false;
					for(int  n=0;n<k;n++)
					{
						if(intersection[k]==a[i])
						{
							flag=true;
							break;
						}
					}	
					if(!flag)
					{
						System.out.printf("%d\t",a[i]);
						intersection[k++]=a[i];
					}
					break;
				}
			}
		}
		
	}

}
public class IntersectionArrAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		System.out.println("Enter First Array element");
		int arr1[] = new int[n];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Second Array element");
		int arr2[] = new int[n];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		ArrayIntersection ai = new ArrayIntersection();
		ai.inputArrays(arr1,arr2);
		ai.findIntersection();
		
	}
}
		
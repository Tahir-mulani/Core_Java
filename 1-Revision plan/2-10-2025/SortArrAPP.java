/*Q4. Write program to create class name as SortArr with two functions
 void setArray(int a[]): this function can accept array as parameter
 int [] getSortArray(): this function can perform sorting on array and return sorted array
*/


import java.util.*;
class SortArr
{
	int m[];
	void setArray(int a[])
	{
		m=a;
	}
	int[] getSortArr()
	{
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=i+1;j<m.length;j++)
			{
				if(m[i]>m[j])
				{
					int temp=m[i];
					m[i]=m[j];
					m[j]=temp;
				}
			}
		}
		return m;
	}
}
public class SortArrAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Array Element");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before sorting");
		for(int k : arr)
		{
			System.out.println(k);
		}
		SortArr sd = new SortArr();
		sd.setArray(arr);
		
		System.out.println("Array After sorting");
		int s[] = sd.getSortArr();
		for(int i : s)
		{
			System.out.println(i);
		}
	}
}
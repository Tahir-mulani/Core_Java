/*Q4. Write program to create class name as FindMax with two functions
 void setArray(int a[]): this function is used for accept array as parameter
 int getMax(): this function can find the max value from array and return it.
*/

import java.util.*;
class findMax
{
	int m[];
	void setArray(int a[])
	{
		m=a;
	}
	int getMax()
	{
		int max=m[0];
		for(int i=0;i<m.length;i++)
		{
			if(m[i]>max)
			{
				max=m[i];
			}
		}
		return max;
	}
}
public class FindMaxAPP
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
		
		findMax fd = new findMax();
		fd.setArray(arr);
		System.out.println("Max value of Array is "+fd.getMax());
	
	}
}
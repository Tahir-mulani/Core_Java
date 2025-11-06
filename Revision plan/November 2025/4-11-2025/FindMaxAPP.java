/*
Q3. Write program to create class name as FindMax with two functions
       void setArray(int a[]): this function is used for accept array as parameter
       int getMax(): this function can find the max value from array and return it.
*/

import java.util.Scanner;
class FindMax
{
	int a[];
	public void setArray(int a[])
	{
		this.a=a;
	}
	public int getMax()
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
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
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		FindMax m1 = new FindMax();
		m1.setArray(a);
		System.out.println("Max Value in Array is "+m1.getMax());
	
	}
}
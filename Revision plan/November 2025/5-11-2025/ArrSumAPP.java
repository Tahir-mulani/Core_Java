/*
Q3. Write Program create class name as ArrSum with method void setValue(int arr[]) you have to create child class name as GetSum with method
 int getArrSum() you have to accept array values from ArrSum and calculate its sum and return it
 */

import java.util.Scanner;
class ArrSum
{
	int arr[];
	void setValue(int arr[])
	{
		this.arr=arr;
	}

}
class GetSum extends ArrSum
{
	int getArrSum()
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
}
public class ArrSumAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array length");
		int n =sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		GetSum g = new GetSum();
		g.setValue(arr);
		System.out.println("Array Sum is: "+g.getArrSum());	
		
	}
}

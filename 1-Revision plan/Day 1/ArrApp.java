//10. Write a program to create an array of size 5 and display its value?

import java.util.*;
public class ArrApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Display Array Element");
		for(int i=0;i<arr.length;i++)
		{
			System.out.printf("%d\t",arr[i]);
		}
	}
}
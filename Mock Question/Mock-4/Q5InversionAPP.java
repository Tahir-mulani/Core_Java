/*
Q5. Write a program in java to count the number of inversion in a given array
Expected Output : The given array is : 1 9 6 4 5
The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
The number of inversion can be formed from the array is: 5
*/

import java.util.Scanner;
public class Q5InversionAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter array element");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					System.out.printf("(%d,%d)",arr[i],arr[j]);
					count++;
				}
			}
		}
		System.out.println("The number of inversion can be formed from the array is:"+count);
	}
}
		
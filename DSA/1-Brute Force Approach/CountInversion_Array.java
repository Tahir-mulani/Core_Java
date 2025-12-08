/*
Q8. Write a program in java to count the number of inversion in a given array
Expected Output :
 The given array is : 1 9 6 4 5
 The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
 The number of inversion can be formed from the array is: 5
*/

import java.util.Scanner;
public class CountInversion_Array
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit");
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//count inversion logic
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					count++;
					System.out.printf("(%d,%d)",a[i],a[j]);
				}
			}
		}
		System.out.printf("number fo inversion can be formed from array is: %d",count);
	}
}
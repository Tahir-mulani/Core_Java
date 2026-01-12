/*
Q7. Sort Array in Ascending Order
Class: ArraySort
Functions:
void inputArray(int arr[])
void sortArray()
Logic: Use Bubble Sort / Selection Sort.
*/
import java.util.*;
class ArraySort
{	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}
	void sortArray()
	{
		//--> Bubble sort
		int n = a.length;
		boolean swapped;
		for(int i=0;i<n-1;i++){
			swapped = false;
			for(int j=0;j<n-i-1;j++){
				if(a[j] > a[j+1]){
					//swap a[j] and a[j+1]
					int temp =a[j];
					a[j] = a[j+1];
					a[j+1] =temp;
					swapped = true;
				}				
			}
			//if no two elements were swapped, array is sorted
			if(!swapped) break;
		}
		/*	
		--> Selection sort
		
		for(int i=0;i<n-1;i++)
		{
			//asssume the minimum is the frst unsorted element
			int minIndex = i;
			
			//find the actual minimum in the unsorted part
			for(int j=i+1; j<n;j++)
			{
				if(a[j] > a[minIndex])
				{
					minIndex = j;
				}
			}
			
			//swap the found minimum with the first unsorted element
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
		*/
			for(int e: a)
			{
				System.out.print(e+" ");
			}
	}
}
public class ArraySortAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		
		int arr[] =new int[n];
		System.out.println("Enter array elements");
		for(int i=0 ;i <n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Before Sort given array is :");

		for(int e : arr)
		{
			System.out.print(e+" ");
		}
	
		ArraySort sort = new ArraySort();
		sort.inputArray(arr);
		
		System.out.println("\nAfter Sort given array is :");
		sort.sortArray();
		
		
	}
}
		
		
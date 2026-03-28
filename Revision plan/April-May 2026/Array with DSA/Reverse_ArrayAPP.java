//Write a java program to display the reverse array.
import java.util.*;
public class Reverse_ArrayAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array Element");
		for(int i=0;i<n;i++)
		{			 
			arr[i] = sc.nextInt();		
		}
		System.out.println("Array before Reverse");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int left=0,right =n-1;
		while(left<right){
			 int temp = arr[left];
			 arr[left] = arr[right];
			 arr[right] = temp;
			 right--;
			 left++;
		}
		System.out.println("\nArray After Reverse");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
		
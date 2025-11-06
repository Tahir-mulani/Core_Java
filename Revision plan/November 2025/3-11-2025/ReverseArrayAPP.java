/*
4.Reverse an Array
Concept: Swap elements from both ends moving toward the center.
 Use Case: Invert order of operations or list of commands.
Example: arr = [10, 20, 30, 40, 50]
Reversed array: [50, 40, 30, 20, 10]
*/

public class ReverseArrayAPP
{
	public static void main(String x[])
	{
		int arr[] = {10, 20, 30, 40, 50};
		System.out.println("Before reverse");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		int r=0;
		int l=arr.length-1;
		while(r<l)
		{
			int temp=arr[r];
			arr[r]=arr[l];
			arr[l]=temp;
			r++;
			l--;
		}
		System.out.println("After reverse");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}
}
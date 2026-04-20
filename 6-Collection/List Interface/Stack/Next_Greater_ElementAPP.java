/*
3. Next Greater Element
Description: For every element, find the next greater element on its right side.
Explanation: Use stack to track elements whose next greater is not yet found.
Example: Input → [4, 5, 2, 10] Output → [5, 10, 10, -1] */
import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;
public class Next_Greater_ElementAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int arr[] = new  int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int result[] = nge(arr);
		System.out.println(Arrays.toString(result));
		
	}
	public static int[] nge(int[] arr)
	{
		int n= arr.length;
		int result[] = new int[n];
		
		Stack<Integer> stack = new Stack<>();
		
		//Traverse from right to left
		for(int i= n-1; i>= 0;i--)
		{
			//remove smaller elements 
			while(!stack.isEmpty() && stack.peek()  <= arr[i])
			{
				stack.pop();
			}
			
			if(stack.isEmpty())
			{
				result[i] = stack.peek();
			}
			
			//push current element
			stack.push(arr[i]);
			
		}
		
		return result;
		
	}
}
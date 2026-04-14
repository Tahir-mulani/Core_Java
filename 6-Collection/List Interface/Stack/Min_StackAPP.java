/*
2. Min Stack
Description: Design a stack that can return the minimum element at any time in constant time.
Explanation: Track minimum values along with elements so you can always retrieve the smallest efficiently.
Example: Operations → push(3), push(1), push(2) Minimum → 1 */

import java.util.*;
public class Min_StackAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Stack<Integer> mainStack = new Stack<>();
		Stack<Integer> minStack = new Stack<>();
		System.out.println("Enter element in stack");
		for(int i=1;i<=3;i++)
		{
			int val = sc.nextInt();
			mainStack.push(val);
			 
				minStack.push(val);
			if(val < minStack.pop())
				
		}
		System.out.println(minStack.pop());
	}
}

/*Find Maximum of Two Numbers
Write a function findMax(int a, int b) that returns the maximum of two numbers.
Call this function in main() and print the result.
*/

import java.util.*;
public class MaxTwoNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		int result=findmax(a,b);
		System.out.println(result);
		
		
	}
	public static int findmax(int a,int b)
	{
		int max;
		if(a>b)
		{
			max=a;
		}
		else
		{
			max=b;
		}
		return max;
	}
}

		
		

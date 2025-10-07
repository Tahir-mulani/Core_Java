/*
 Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.
*/

import java.util.Scanner;
public class SwapApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("Number Before Swapping \n a=%d\tb=%d\n",a,b); //10  20
		Swapper s=new Swapper();
		s.swapNum(a,b);
	}
}
class Swapper
{
	void swapNum(int a,int b)
	{
		a=a+b;  
		b=a-b;  
		a=a-b;  
		System.out.printf("\nNumber after Swapping  \na=%d\tb=%d\n",a,b);
	}
}

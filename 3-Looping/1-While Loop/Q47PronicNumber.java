/*
Q47. Write a Java program to print all Pronic numbers between 1 and n.
 A Pronic number is the product of two consecutive integers, i.e., n(n+1).
 Example: 2 (1×2), 6 (2×3), 12 (3×4) etc.
output:
	Enter Number
	4
	(1,2)   2       (2,3)   6       (3,4)   12
*/

import java.util.Scanner;
public class Q47PronicNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter Number");
		n=sc.nextInt();
		int i=1,sum;
		while(i<n)
		{
			sum = i*(i+1);
			System.out.printf("(%d,%d)\t",i,i+1);
			System.out.printf("%d\t",sum);
			i++;
		}
	}
}
		

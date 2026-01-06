/*
Q2. Write a java program to Convert an Integer object into a primitive int.
Explanation :- 
Extracting primitive value from wrapper object is called unboxing.

Input :- Integer num = 50
Output :- 50
*/
import java.util.*;
public class AutoUnBoxingAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		Integer n = sc.nextInt();  // n is reference type of value
		
		int num = n;   //num is primitive type of value.
		System.out.println(num);
	}
}
/*
Q1.Write a Java program to convert a primitive int value into an Integer object using wrapper class.
Explanation :- 
Java provides wrapper classes to convert primitive data types into objects. This is called boxing.

Input :- int num = 25
Output :- 25
*/
import java.util.*;
public class AutoBoxingAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();   //num is primitive type value
		
		Integer n = num;   // n is reference type of value
		
		System.out.println(n);
	}
}
		
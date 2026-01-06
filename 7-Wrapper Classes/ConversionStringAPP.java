/*
Q3.Write a Java program to take a numeric string "123" and convert it to a primitive int using Integer.parseInt().
Then add 10 and print the result.
Explanation:
The parseInt() method of Integer class converts a numeric string into an int.
It’s useful for reading numbers from text input (like user input).
*/
import java.util.*;
public class  ConversionStringAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		int n = Integer.parseInt(str);
		System.out.println("Converting String to Integer Primitive  n = "+n);
		
	}
}
/*
Q5.Write a Java program to create two Integer objects with the same value.
Compare them using both == operator and equals() method. Print the results.
Explanation:
== compares object references, not values (except for some cached integer cases).
equals() checks the actual value stored inside the wrapper object.
This teaches the difference between reference comparison and value comparison in wrapper classes.
*/
import java.util.*;
public class CompareTwoIntegerObjectsAPP
{
	public static void main(String x[])
	{
		 
		Integer val1 = Integer.valueOf(200);
		 
		Integer val2 = Integer.valueOf(200);
		
		System.out.println("According to the '==' Operator");
		
		if(val1 == val2)
		{
			System.out.println("Both reference are equal");
		}
		else
		{
			System.out.println("Both reference are not equal");
		}
		
		 
		System.out.println("According to the equals() method");
		if(val1.equals(val2))
		{
			System.out.println("Both reference are equal");
		}
		else
		{
			System.out.println("Both reference are not equal");
		}
	}
}
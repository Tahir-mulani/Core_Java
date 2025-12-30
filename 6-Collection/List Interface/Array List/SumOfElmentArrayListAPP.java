/*
Q2. Create an ArrayList of integers and calculate the sum of all elements.

	Explanation:
	 This question practices:
Iterating over ArrayList
Performing arithmetic operations
Using get(index) method
*/
import java.util.*;
public class SumOfElmentArrayListAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter Element in ArrayList");
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		 
		
		Iterator i = list.iterator();
		int sum=0;
		while(i.hasNext())
		{
			sum += (int)i.next();
		}
		System.out.println("Sum of Element in ArrayList is = "+sum);
	}
}
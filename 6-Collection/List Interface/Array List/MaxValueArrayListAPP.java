/*
Q3. Write a program to find the maximum value from an integer ArrayList.
Explanation:
 You will learn:
How to compare elements
Store maximum value manually
Logical thinking without built-in methods
*/
import java.util.*;
public class MaxValueArrayListAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter Element in ArrayList");
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		int max = 0;
		
		for(int i=0;i<list.size();i++)
		{
			if((int)list.get(i)>max)
			{
				max = (int)list.get(i);
			}
		}
		System.out.println("Maximum Value in ArrayList is = "+max);
	}
}

		
/*
Q4. Create an ArrayList and find the minimum element.
Explanation:
 Similar to max logic, this improves:
Conditional checking
Traversal logic
*/
import java.util.*;
public class MinValArrayListAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter Element in ArrayList");
		list.add(sc.nextint());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		int min = 0;
		for(int i=0;i<list.size();i++)
		{
			if(min > (int)list.get(i))
			{
				min = (int)list.get(i);
			}
		}
		System.out.println("Minimum Value in ArrayList is = "+min);
	}
}
		
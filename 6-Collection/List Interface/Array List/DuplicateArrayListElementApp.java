/*Write a Java program using ArrayList<Integer> to find all 
elements that appear more than N/3 times, where N is the size of the ArrayList.
Example: Input: [1, 2, 3, 1, 1, 2, 1, 2, 2, 2]
Output: 1, 2*/
import java.util.*;
public class DuplicateArrayListElementApp
{
	public static void main(String x[])
	{
		 
		List<Integer> list = Arrays.asList(1,2, 3, 1, 1, 2, 1, 2, 2, 2);
		int n = list.size();
		Set<Integer> result = new LinkedHashSet<>();
		for(int i =0;i<n;i++)
		{
			int count = 1;
			int current = list.get(i);
			for(int j=i+1;j<n;j++)
			{
				if(current== list.get(j))
				{
					count++;
				}
			}
			if(count > n/3)
			{
				result.add(current);
			}
		}
		System.out.println(result);
				
	}
}
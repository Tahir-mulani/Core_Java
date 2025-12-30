/*
Q8. Write a java program to Reverse an integer ArrayList without using inbuilt reverse method.
Explanation:
 This improves:
Index manipulation
Swapping logic
Understanding list size
*/
import java.util.*;
public class ReverseArrayListAPP
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
		list.add(sc.nextInt());
		
		int low = 0,high=list.size()-1;
		
		while(low<high)
		{
			int temp = (int)list.get(low);
			list.set(low,(int)list.get(high));
			list.set(high,temp);
			low++;
			high--;
		}
		System.out.print(list+" ");
	}
}
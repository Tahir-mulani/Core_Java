/*
Q7. Write a java program to Remove all even numbers from an integer ArrayList.
Explanation:
 This teaches:
Removing elements using remove(index)
Handling shifting of elements after removal
Reverse loop concept
*/
import java.util.*;
public class RemoveEvenElementArrayListAPP
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
		
		
		System.out.println("Before removing "+list);
		for(int i=0;i<list.size();i++)
		{
			if((int)list.get(i)%2==0)
			{
				list.remove((int)list.get(i));
			}
		}
		System.out.println("After remove even elements "+list);
	}
}
			
		
	
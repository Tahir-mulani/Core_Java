/*
Q9. Write a java program to Copy all elements from one integer ArrayList to another.
Explanation:
 This practices:
Working with multiple ArrayList objects
Element-by-element copying
*/
import java.util.*;
public class CopyElementArrayListAPP
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.println("Enter elements in list 1");
		list1.add(sc.nextInt());
		list1.add(sc.nextInt());
		list1.add(sc.nextInt());
		
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println("Enter elements in list 2");
		
		list2.add(sc.nextInt());
		list2.add(sc.nextInt());
		list2.add(sc.nextInt());
		
		list1.addAll(list2);
		
		System.out.print(list1+" ");
	}
}
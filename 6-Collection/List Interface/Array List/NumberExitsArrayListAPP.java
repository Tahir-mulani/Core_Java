/*
Q6. Write a java program to Check whether a given number exists in an ArrayList.
Explanation:
 You learn:
Linear search logic
Use of flag variable
Comparison using loop
*/
import java.util.*;
public class NumberExitsArrayListAPP
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
		
		int num = 20;
		boolean flag = false;
		
		 for(int i=0;i<list.size();i++)
		 {
			 if((int)list.get(i) == num)
			 {
				 flag = true;
			 }
		 }
		 if(flag)
		 {
			System.out.println("Value Found");
		 }
		else
		{
			System.out.println("Value Not Found");
		}
		
	}
}
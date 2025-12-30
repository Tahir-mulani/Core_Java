/*
Q10. Write a java program to Identify and display duplicate numbers in an integer ArrayList.
Explanation:
 This helps you understand:
Nested loops
Comparison logic
Handling repeated values
*/
import java.util.*;
public class DuplicateArrayListAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("enter element in ArrayList");
		list.add(sc.nextInt());   
		list.add(sc.nextInt());   
		list.add(sc.nextInt());    
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		boolean flag[]= new boolean[list.size()];
		System.out.print("Duplicate Element is = ");
		for(int i=0;i<list.size();i++)
		{
			if(flag[i]) continue;
			
			int cnt=0;
			for(int j=0; j<list.size();j++)
			{
				if((int)list.get(i) == (int)list.get(j))
				{
					cnt++;
					flag[j] = true;
				}
			}
			if(cnt>1){ System.out.print((int)list.get(i)+" "); }	
		}
	}
}
		
		
		
		
//Reverse an ArrayList without using Collections.reverse()
import java.util.*;
public class Reverse_List
{
	public static void main(String x[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		 
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		 
		
	}
}
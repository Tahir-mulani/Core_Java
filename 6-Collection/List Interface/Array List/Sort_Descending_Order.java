//Sort a List in descending order
import java.util.*;
public class Sort_Descending_Order
{
	public static void main(String x[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(2);
	 
		for(int i=0;i<list.size()-1;i++)
		{
			int maxIndex = i;
			for(int j = i+1;j<list.size();j++)
			{
				if(list.get(j) > list.get(maxIndex))
				{
					maxIndex = j;
				}
			}
				
			//swap
			int temp = list.get(i);
			list.set(i,list.get(maxIndex));
			list.set(maxIndex,temp);
		}
		
		System.out.println(list);
		
		
		
	}
}		
		
import java.util.*;
public class HasNextMethodAPP
{	
	public static void main(String x[])
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("ABC");
		list.add("PQR");
		list.add("MNO");
		
		Iterator<String> i = list.iterator(); //get iterator
		System.out.println("Traverse element using iterator");

		while(i.hasNext())    //check element exists
		{
			 Object obj = i.next(); //return next value.
			System.out.println(obj);
		}
	}
}

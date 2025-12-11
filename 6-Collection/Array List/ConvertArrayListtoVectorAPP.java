/*
Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/

import java.util.*;
public class ConvertArrayListtoVectorAPP
{
	public static void main(String x[])
	{
		//create ArrayList
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(40);
		list.add(30);
		
		//convert ArrayList to Vector
		Vector v = new Vector();		
		
		for(int i=0;i<list.size();i++)
		{
			v.add((int)list.get(i));
		}
		
		
		//sorting 
		for(int i=0;i<v.size()-1;i++)
		{
			for(int j=0;j<v.size()-i-1;j++)
			{
				if(((int)v.get(j)) >((int)v.get(j+1)))
				{
					int temp = (int)v.get(j);
					v.set(j,(int)v.get(j+1));
					v.set(j+1,temp);
				}
			}
		}
		
		//print
		System.out.println("Sorted Vector:");
		for(Object obj:v)
		{
			System.out.println(obj);
		}
		
	}
}
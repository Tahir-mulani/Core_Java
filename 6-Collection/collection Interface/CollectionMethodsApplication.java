import java.util.*;
public class CollectionMethodsApplication
{
	public static void main(String x[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		 
		 
		System.out.println("size of collection : "+list.size());
	
		  
		//isEmpty() Method
		boolean a  = list.isEmpty();
		if(a)
		{
			System.out.println("ArrayList is empty");
		}
		else
		{
			System.out.println("ArrayList is not empty");
		}
		
		 
		//contains() Method
		a = list.contains(20);
		if(a)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("element not found");
		}
		
		 
		//iterator() Method
		Iterator i = list.iterator();
		while(i.hasNext())
		{
			Object obj = i.next();
			System.out.print(obj+" ");
		}
		
		 		
		//toArray() Method
		Object obj[] = list.toArray();
	 
		 
		//add(E) Method
		a= list.add(40);
		if(a)
		{
			System.out.println("Element Added SuccesFully !");
		}
		else
		{
			System.out.println("Element not added");
		
		}
		
		 
		//remove(java.lang.object) Method
		a= list.remove(Integer.valueOf(40));  /*in this code we are not using genric 
		                                                 then we convert primitve int 40 into
														 an Integer object*/
	 
		if(a)
		{
			System.out.println("Element removed SuccesFully !");
		}
		else
		{
			System.out.println("Some problem is there!");
		}
		
		 
		//containsAll() Method		 
		Collection cl = new ArrayList();
		cl.add(10);
		cl.add(20);
		cl.add(30);		 
		a= cl.containsAll(list);
		if(a)
		{
			System.out.println("value found");
		}
		else
		{
			System.out.println("Value not found");
		}
		
		 
		//addAll() Method		
		a = list.addAll(cl);
		if(a)
		{
			System.out.println("value added");
		}
		else
		{
			System.out.println("value not added");
		}
			
		//removeALL() Method
		
		//void clear() Method
		list.clear();
		
			
		
			
			
	}
}
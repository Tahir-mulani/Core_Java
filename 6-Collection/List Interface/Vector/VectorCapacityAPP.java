import java.util.*;
public class VectorCapacityAPP
{
	public static void main(String x[])
	{
		Vector v = new Vector(5);
		int capacity = v.capacity();
		System.out.println("Default capacity of vector : "+capacity);
		v.add(100);
		v.add(100);
		v.add(100);
		v.add(100);
		v.add(100);
		v.add(100);
		System.out.println("After adding element");
		int size  = v.size();
		System.out.println("current size of vector : "+size);
		
		capacity = v.capacity();
		System.out.println("current capacity of vector increase double : "+capacity);
		
	}
}
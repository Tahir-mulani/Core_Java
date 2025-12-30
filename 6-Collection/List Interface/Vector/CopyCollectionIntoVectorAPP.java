import java.util.*;
public class CopyCollectionIntoVectorAPP
{
	public static void main(String x[])
	{
		Collection c = new ArrayList();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		
		Vector v = new Vector(c);
		System.out.println(v);
	}
}
		
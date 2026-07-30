//Consumer Interface
import java.util.function.*;
import java.util.*;
public class ConsumerApp
{
	public static void main(String x[])
	{
		Arrays
			.asList(10,20,30,40,50)
			.forEach((Integer val)->  System.out.println(val));
	}
}
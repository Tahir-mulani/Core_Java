import java.util.function.*;
import java.util.stream.*;
import java.util.*;
public class StreamAPI_DemoApp
{
	public static void main(String x[])
	{
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		Stream<Intger> s = list.stream();
		System.out.println(s);
		
	
	}
}
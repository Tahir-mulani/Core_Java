import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class StreamAPI_APP
{
	public static void main(String x[])
	{
		List<Integer> list = List.of(10,20,30,40);
		
	 
		
		Function<Integer,Integer> f = new Function<Integer,Integer>(){
			public Integer apply(Integer val)
			{
				return val+val;
			}
		};
		int sum = list.stream()
							   .mapToInt(Integer :: intValue)
							   .sum();
		
		System.out.println("sum is ="+sum);

	}
}
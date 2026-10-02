import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class DemoAPP
{
	public static void main(String x[])
	{
		Map<Integer,String> map = new HashMap<>();
		map.put(101,"a");
		map.put(102,"b");
		map.put(103,"c");
		map.put(104,"d");
		map.put(105,"e");
	
		for(Map.Entry<Integer,String> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
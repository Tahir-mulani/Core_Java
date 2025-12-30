import java.util.*;
public class HashMapMethodApplication
{
	public static void main(String x[])
	{
		HashMap map = new HashMap();
		map.put(1,"ABC");
		map.put(20,"MNO");
		map.put(100,"PQR");
		map.put(70,"LKG");
		map.put(40,"STU");
		map.put(30,"EDF");
		map.put(120,"FKA");
		map.put(104,"SSS");
		map.put(48,"TTT");
		
		Set<Map.Entry> set = map.entrySet();
		
		for(Map.Entry m:set)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}
}
		
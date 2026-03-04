import java.util.*;
public class Practice1
{
	public static void main(String x[])
	{
		HashSet<String> list = new HashSet<>();
		list.add("JAVA");
		list.add("Python");
		list.add("C++");
		System.out.println("Programming language:");
		for(String s : list){
		System.out.println(s);
		}
	}
}
	
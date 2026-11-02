class Singleton
{
	private static Singleton obj;
	
	private Singleton()
	{
		System.out.println("obj created");
	}
	
	public static Singleton getInstance()
	{
		if(obj == null)
			obj = new Singleton();
			
		return obj;
	}
}
public class SingletonApp
{
	public static void main(String x[])
	{
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1 == obj2);
	}
}
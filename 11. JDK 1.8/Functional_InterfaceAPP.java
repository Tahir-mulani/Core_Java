@FunctionalInterface
interface ABC
{
	void show();
}
public class Functional_InterfaceAPP
{
	public static void main(String x[])
	{
		ABC abc = new ABC(){
			void show()
			{
				System.out.println("I am show from abc");
			}
		};
		abc.show();
	}
} 

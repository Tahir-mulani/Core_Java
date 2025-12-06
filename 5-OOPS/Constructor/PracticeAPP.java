class A
{
	A(int a)
	{
		System.out.println("Good");
	}
}
class B extends A
{
	B()
	{
		super(100);
		this();
		System.out.println("Morning");
	}
}
public class PracticeAPP
{
	public static void main(String x[])
	{
		B b = new B();
	}
}
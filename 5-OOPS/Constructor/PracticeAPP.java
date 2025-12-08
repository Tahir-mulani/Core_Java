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
		System.out.println("I am B default constructor");
	}
	B(int a)
	{
		super(100);
		System.out.println("I am B "+a);
	}
}
class C extends B
{
	C(int a)
	{
		System.out.println("I am C "+a);
	}
}
public class PracticeAPP
{
	public static void main(String x[])
	{
		 C c1 = new C(100);
	}
}
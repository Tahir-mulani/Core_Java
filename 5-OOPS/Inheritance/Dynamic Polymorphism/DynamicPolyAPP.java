//using parent reference create a object of child class
class Value
{
	int a,b;
	void setValue(int x,int y)
	{
		a=x;
		b=y;
	}
	int getResult()
	{
		return 0;
	}
}
class Add extends Value
{
	int getResult()
	{
		return a+b;
	}
}
class Mul extends Value
{
	int getResult()
	{
		return a*b;
	}
}
public class DynamicPolyAPP
{
	public static void main(String x[])
	{
		Value v = new Add(); 
		v.setValue(10,20);
		int result =v.getResult();
		System.out.println("Addition is "+result);
		v=new Mul();
		v.setValue(3,4);
		result=v.getResult();
		System.out.println("Multiplication is "+result);
	}
}
		

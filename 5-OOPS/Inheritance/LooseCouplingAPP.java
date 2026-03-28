class Value
{
	int a,b;
	void setValue(int a,int b)
	{
		this.a= a;
		this.b=b;
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
class Calculator
{
	void performOperation(Value v)
	{
		int result  = v.getResult();
		System.out.println("result is "+result);
	}
	
}
public class LooseCouplingAPP
{
	public static void main(String x[])
	{
		Calculator c = new Calculator();
		Value v = null;
		v = new Add();
		v.setValue(2,3);
		c.performOperation(v);
		 
		v = new Mul();
		v.setValue(2,5);
		c.performOperation(v);
	}
}
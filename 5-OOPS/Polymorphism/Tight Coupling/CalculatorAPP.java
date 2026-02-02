class Value
{
	int a,b;
	
	void setValue(int a,int b)
	{
		this.a = a;
		this.b = b;
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
	void performOperation(Add ad)
	{
		int result = ad.getResult();
		System.out.println("Additon is "+result);
	}
	
}
public class CalculatorAPP
{
	public static void main(String x[])
	{
		Calculator c = new Calculator();
		Add ad = new Add();
		ad.setValue(10,20);
		c.performOperation(ad);
	}
}

	
	
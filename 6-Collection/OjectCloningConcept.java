class Square implements Cloneable
{
	int no;
	void setValue(int no)
	{
		this.no = no;
	}
	void showSquare()
	{
		System.out.println("Square is "+no*no);
	}
	public Square getCloneObject() throws CloneNotSupportException
	{
		Object obj = this.clone();
		return (Square)obj;
	}
}
public class OjectCloningConcept
{	
	public static void main(String x[])
	{
		Square s1 = new Square;
		s1.setValue(10);
		Square s2 = s1.getCloneObject();
		s2.setValue(5);
		s1.showSquare();
	}
}
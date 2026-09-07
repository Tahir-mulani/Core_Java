class AirthmeticException extends RuntimeException
{
	AirthmeticException()
	{
		super();
	}
	
	public AirthmeticException(String message)
	{
		super(message);
	}
}
public class TestExceptionAPP
{	
	public static void main(String x[])
	{
		int age = 15;
		if(age < 18)
		{
			throw new AirthmeticException("age limit error");
		}
			
	}
}
		
		
public class ExceptionAPP
{
	public static void main(String x[])
	{
		int age = 10;
		if(age<18)
		{
			throw new ArithmeticException("you are not eligible for the vote, age must above 18 yrs");
		}
		System.out.println("you are eligible for the vote");
	}
}

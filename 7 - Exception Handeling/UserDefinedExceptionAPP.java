class VoterException extends RuntimeException
{
	public String getErrorMessage()
	{
		return "you are not eligible for voting";
	}
}
class VoterChecker
{
		void validateVoter(int age)
		{
			
			if(age < 18)
			{
				throw new VoterException();
			}
			else
			{
				System.out.println("you are eligible for voting");
			}
		}
}
public class UserDefinedExceptionAPP
{
	public static void main(String x[])
	{
		try
		{
			VoterChecker v = new VoterChecker();
			v.validateVoter(17);
		}
		catch(VoterException e)
		{
			System.out.println(e.getErrorMessage());
		}
		
	}
}
import java.util.*;
class VoterException extends RuntimeException{
	public String getErrorMessage(){
		return "You are not eligible for voting";
	}
}

class CheckVoter{
	void validateVoter(int age){
		if(age < 18){
			throw new VoterException();
		} else{
			System.out.println("You are elgible for Voting!");
		}
	}
}
public class Throw_Exception{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		 try{
			 CheckVoter cv = new CheckVoter();
			 cv.validateVoter(age);
		 }catch(VoterException e)
		 {
			 System.out.println(e.getErrorMessage());
		 }
	}
}
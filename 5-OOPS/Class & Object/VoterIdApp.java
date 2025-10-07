/*
Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation.
*/

import java.util.Scanner;
class Voter
{
	 void isEligible(int age)
	 {
		 String str=(age>18)? "person is Eligible to Vote":"person is not Eligible to Vote";
		 System.out.println(str);
	 }
}
public class VoterIdApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Voter v = new Voter();
		System.out.println("Enter Age of person");
		int age=sc.nextInt();
		v.isEligible(age);
	}
}
/*
**8. Email Address Validator**

**Description:**

* Ask the user for an email address.
* If email doesn’t contain '@', **continue** to ask again.
* If user enters "cancel", **break**.
* Use a do-while loop to validate and accept only proper emails.
*/

import java.util.Scanner;
public class EmailValidator
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		String st;
		System.out.println("Enter Email-Id");
		st=sc.nextLine();
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='@')
			{
				count++;
			}
		}
		
		
		/*do{
			System.out.println("1.Email valid");
			System.out.println("
			if(st.equalsIgnoreCase("cancel")){
					break;
			switch(count)
	*/
		do{			
			
				
			if(count==2){
				System.out.println("Email does'nt Contain");
				st="cancel";
			}
			else{
				System.out.println("valid Email-Id");
				break;
			}
		}while(!st.equalsIgnoreCase("cancel"));
	}
}
	
		
/**3. Password Strength Checker**

**Description:**

* Ask the user to enter a password in a do-while loop.
* If the password length is less than 6 characters, display a message and **continue** to re-ask.
* If the password is "quit", stop asking (**break**).
* Otherwise, print "Password accepted" and exit. */

import java.util.Scanner;
public class PasswordStrength
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		String password;
		
		do{
			System.out.println("Enter password");
			password=sc.next();
			
			if(password.length()<6){
				 if((password.equalsIgnoreCase("quit")==false))
				System.out.println("Password length must greater be 6 characters!!!");
				continue;
			}
			else{
				System.out.println("Password Accepted !!!");
				break;
			}
			
		}while(!password.equalsIgnoreCase("quit")); // password not equal to quite (.equalsIgnoreCase) string equal method
		System.out.println("End of Main");
	}
}
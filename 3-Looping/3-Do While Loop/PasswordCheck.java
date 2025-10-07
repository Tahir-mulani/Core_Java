/*
**3. Password Strength Checker**

**Description:**

* Ask the user to enter a password in a do-while loop.
* If the password length is less than 6 characters, display a message and **continue** to re-ask.
* If the password is "quit", stop asking (**break**).
* Otherwise, print "Password accepted" and exit.
*/
import java.util.Scanner;
public class PasswordCheck
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		String p;
		
		do{
		   System.out.println("Enter Password");
		   p=sc.nextLine();
		   
		   if(p.length()<6){
			    if(p.equalsIgnoreCase("quit")){
					break;
				}
				System.out.println("Password must be six characters");
				continue;
			}else{
				System.out.println("Password Accepted");
				break;
			}
		}while(!p.equalsIgnoreCase("quit"));
	}
}
				
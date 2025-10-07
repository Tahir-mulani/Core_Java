/**1. ATM PIN Validation**/
/* Asks the user for a 4-digit ATM PIN.
* Gives **max 3 attempts** to enter the correct PIN using a do-while loop.
* If the PIN is correct, print "Access Granted" and **break** the loop.
* If attempts are over, print "Card Blocked". */


import java.util.Scanner;
public class ATMApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int pin;
		int count=1;
		int opin=2004;
		do{
			System.out.println("Enter 4 digit Pin");
			pin=sc.nextInt();
			if(opin==pin){
				System.out.println("Access granted");
				break;
			}else{
				count++;
			}
		}while(count<=3);
		if(count==4)
		{
			System.out.println("Card is blocked");
		}
	}
}
						
		
		
		
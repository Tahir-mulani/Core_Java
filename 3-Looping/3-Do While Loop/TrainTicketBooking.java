/*
 **7. Train Ticket Booking**

**Description:**

* Ask the user to select a seat number.
* If seat is already booked (use a sample booked seat list), **continue** to ask again.
* If the user enters "exit", **break** the loop.
* Use a do-while loop to keep asking until a valid seat is booked.
*/

import java.util.Scanner;
public class TrainTicketBooking
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		do{
			System.out.println("Select Seat Number");
			n=sc.nextInt();
			if(n<1 || n>10){
				System.out.println("Invalid Seat Number");
				continue;
			}
			else if(n>0 && n<6){
				System.out.println("Seat is already booked");
				continue;
			}
			else{
				System.out.println("congrats Seat is booked");
				break;
			}
				
		}while(n<=10);
	}
}
		
			
/*
 **9. Restaurant Ordering System**

**Description:**

* Show menu items and let user order.
* If they choose "skip", **continue** to next iteration without adding to order.
* If "done" is entered, **break** and print final bill.
* Implement using a do-while loop.
*/

import java.util.Scanner;
public class RstaurantOrderSystem
{
	public static void  main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int od;
		int bill=0;
		do{
			System.out.println("1.burger cost: 30rs");
			System.out.println("2.Pizza cost:60rs");
			System.out.println("3.dabeli cost: 20rs");
			System.out.println("4.skip(not add item)");
			System.out.println("5.order done!");
			System.out.println("choose order");
			od=sc.nextInt();
			
			switch(od){
				
				case 1: bill+=30;
					continue;
				 
				case 2: bill+=60;
					continue;
				
				case 3: bill+= 20;
					continue;
				
				case 4: bill=bill;
					continue;
				
				case 5: 
					System.out.println("Order is Done!");
					break;
				
			}
			if(od==5){
				break;
			}				
		}while(true);
		System.out.println("Total bill :"+bill);
		
	}
}
						
				
				


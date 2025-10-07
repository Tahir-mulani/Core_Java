/*
**6. Temperature Logger**

**Description:**

* Ask the user to enter daily temperatures.
* Use **continue** if the entered temperature is negative (invalid reading).
* Use **break** if the user enters "stop".
* Keep looping with do-while until break condition.
*/

import java.util.Scanner;
public class TemperatureLogger
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		String t;
		do{
			
			System.out.println("Enter Daily Temperature");
			t=sc.nextLine();
			
			if(t.equalsIgnoreCase("stop"))
				break;
				
			int tno=Integer.parseInt(t);
			
			if(tno<0){
				System.out.println("Invalid Reading");
				continue;
			}
			else{
				System.out.println(t);
			}
		}while(true);
	}
}
				
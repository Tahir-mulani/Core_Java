/*
**4. Number Guessing Game**

**Description:**

* System generates a random number between 1–100.
* Use a do-while loop to let the user guess the number.
* If guess is too high or low, give a hint and **continue**.
* If the guess is correct, print "You guessed it!" and **break**.
*/

import java.util.Scanner;
import java.util.Random;
public class NumberGuessGame
{
	public static void main(String x[])
	{
		Random rn=new Random(); // create a random class 
		Scanner sc=new Scanner(System.in);
		int a,b;
		b=rn.nextInt(100)+1; // input random number
		do
		{
			System.out.println("Enter Guess number");
			a=sc.nextInt();
			if(a>b)
			{
				System.out.println("To high....Try again");
				continue;
			}
			else if(b>a)
			{
				System.out.println("To low.....Try again");
				continue;
			}
			else
			{
				System.out.println("You guessed it! ");
				break;
			}
		}while(b!=a);
	}
}

			
			
			
			
		
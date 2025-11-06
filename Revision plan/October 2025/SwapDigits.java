/* Write a java program to swaps the first two digits with the last two digits, and prints the
result.
Input : 12345
Output : 45312 
*/

import java.util.*;

public class SwapDigits 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int digits = 0;

        // Step 1: count digits
        while (temp > 0)
		{
            temp = temp / 10;
            digits++;
        }

        if (digits < 4)
		{
            System.out.println("Number must have at least 4 digits!");
            return;
        }

        // Step 2: find divisor for first two digits
        int div = 1;
        int d = digits - 2; // digits to remove from right
        for (int i = 1; i <= d; i++)
		{
            div = div * 10;
        }
        // Extract parts
        int firstTwo = num / div;       // first two digits
        int lastTwo = num % 100;        // last two digits

        // Remove first two and last two to get middle
        int middle = (num / 100) % (div / 100);

        // Step 3: Rebuild number manually (no Math.pow)
        int result = lastTwo * div + middle * 100 + firstTwo;

        System.out.println("After swapping: " + result);
    }
}

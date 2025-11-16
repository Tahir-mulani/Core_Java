/*
Q3. Write a java program to swaps the first two digits with the last two digits,and prints the result.
Input : 12345
Output : 45312
*/import java.util.Scanner;

public class Q3SwapAPP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five digit number:");
        int no = sc.nextInt();

        // count digits
        int temp = no, count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        if (count != 5) {
            System.out.println("Please enter a 5 digit number.");
            return;
        }

        // Extract five digits
        int d5 = no % 10;        // last digit
        no = no / 10;

        int d4 = no % 10;        // 2nd last
        no = no / 10;

        int d3 = no % 10;        // middle digit
        no = no / 10;

        int d2 = no % 10;        // 2nd digit
        no = no / 10;

        int d1 = no % 10;        // first digit

        // Swap: first two ↔ last two
        int newNum = (d4 * 10000) + (d5 * 1000) + (d3 * 100) + (d2 * 10) + d1;

        System.out.println("After swapping first two with last two: " + newNum);
    }
}

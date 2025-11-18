import java.util.Scanner;

public class LogicalOperatorWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Logical AND
        if (a > 0 && b > 0) {
            System.out.println("Both numbers are positive.");
        }

        // Logical OR
        if (a < 0 || b < 0) {
            System.out.println("At least one number is negative.");
        }

        // Logical NOT
        boolean equal = (a == b);
        System.out.println("Are both numbers equal? " + equal);
        System.out.println("Using NOT operator: Numbers are not equal? " + !equal);
    }
}

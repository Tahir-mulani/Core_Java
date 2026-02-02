
/*Q14. Write a program to check whether a string is empty or not.
 Input : " "
 Output : String is empty */
import java.util.*;

public class CheckStringEmptyAPP {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        if (str.length() == 0) {
            System.out.println("String is Empty");
        } else {
            System.out.println("String is not Empty");
        }

        // OR

        boolean result = str.isEmpty();
        if (result) {
            System.out.println("String is Empty");

        } else {
            System.out.println("String is not Empty");
        }
        sc.close();
    }
}

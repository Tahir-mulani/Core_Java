
/*Q17. Write a program to find ASCII value of a character from a string.
 Input : A
 Output : 65 */
import java.util.*;

public class FindASCIIValueAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Character");
        String str = sc.nextLine();

        System.out.println("ASCII value for given character : " + (int) str.charAt(0));
        sc.close();
    }
}

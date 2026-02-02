
/*Q5. Write a program to count consonants in a string.
 Input: Computer
 Output: 5 */
import java.util.*;

public class CountConsonantsAPP {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {

            } else {
                consonants++;
            }

        }
        System.out.println("Gven String consonants are :" + consonants);
        sc.close();
    }
}

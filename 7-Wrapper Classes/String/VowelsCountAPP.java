
/*Q4. Write a program to count the number of vowels in a string.
 Input : Education
 Output : 5 */
import java.util.*;

public class VowelsCountAPP {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        int vowels = 0;

        for (int i = 0;; i++) {
            try {
                char ch = str.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                        || ch == 'O' || ch == 'U') {
                    vowels++;
                }

            } catch (Exception e) {
                break;
            }
        }
        System.out.println("Number Vowels present in String " + vowels);
        sc.close();
    }
}


/*Q10. Write a program to count total words in a string.
 Input : Java is easy
 Output : 3 */
import java.util.*;

public class CountWordsAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        char ch[] = str.toCharArray();

        int count = 0;
        boolean space = false;
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] != ' ') {
                if (!space) {
                    count++;
                    space = true;
                }
            } else {
                space = false;
            }
        }

        System.out.println("Given String There are " + count + " Words");
        sc.close();
    }
}

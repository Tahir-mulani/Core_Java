
/*Q18. Write a program to replace a character in a string.
 Input: banana, 
replace a with o
 Output : bonono */
import java.util.*;

public class ReplaceCharacterToStringAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        char c[] = str.toCharArray();
        System.out.println("Enter character to replace");
        char ch = sc.next().charAt(0);

        System.out.println("Enter target Character");
        char target = sc.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (c[i] == ch) {
                c[i] = target;
            }
        }

        String result = new String(c);
        System.out.println(result);

        sc.close();
    }
}
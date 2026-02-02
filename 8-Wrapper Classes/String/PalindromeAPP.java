
/*Q7. Write a program to check whether a string is palindrome or not.
 Input : madam
 Output : Palindrome */
import java.util.*;

public class PalindromeAPP {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        int start = 0, end = str.length() - 1;
        char ch[] = str.toCharArray();
        boolean flag = false;
        while (start < end) {
            if (ch[start] == ch[end]) {
                flag = true;
            }
            start++;
            end--;
        }
        if (flag) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
        sc.close();
    }
}

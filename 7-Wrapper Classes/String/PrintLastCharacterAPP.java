
/*Q12. Write a program to print the last character of a string.
 Input : India
 Output : a */
import java.util.*;

public class PrintLastCharacterAPP {
    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        char ch[] = str.toCharArray();
        System.out.println("The Last Character of given String :" + ch[ch.length - 1]);
        sc.close();
    }
}

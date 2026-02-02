
/*Q9. Write a program to convert a string into lowercase.
 Input : HELLO
 Output : hello */
import java.util.Scanner;

public class ConvertToLowerCaseAPP {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String in Upper Case");
        String str = sc.nextLine();

        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        str = new String(ch);
        System.out.println("After convert to Upper Case :" + str);
        sc.close();
        ;

    }
}

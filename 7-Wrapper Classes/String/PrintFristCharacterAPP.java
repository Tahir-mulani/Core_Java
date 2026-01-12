
/*Q11. Write a program to print the first character of a string.
 Input : Apple
 Output : A */
import java.util.*;

public class PrintFristCharacterAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();

        char ch[] = str.toCharArray();
        System.out.println("First character of given string is :" + ch[0]);

        sc.close();
    }
}

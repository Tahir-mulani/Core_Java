
/*Q6. Write a program to reverse a given string.
 Input : Java
 Output : avaJ */
import java.util.*;

public class ReverseStringAPP {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String");
        String str = sc.nextLine();

        System.out.println("Before Reverse String :" + str);
        int start = 0, end = str.length() - 1;
        char c[] = str.toCharArray();

        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        str = new String(c);
        System.out.println("After Reverse String :" + str);
        sc.close();
    }
}

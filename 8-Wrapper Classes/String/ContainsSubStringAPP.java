
/*Q20. Write a program to check whether a string contains a substring.
 Input: Java Programming, 
Java
 Output : Substring found*/
import java.util.*;

public class ContainsSubStringAPP {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        System.out.println("Enter substring");
        String sub = sc.nextLine();
        boolean flag = str.contains(sub);
        if (flag) {
            System.out.println("substring found " + sub);
        } else {
            System.out.print("subString not found ");
        }

        sc.close();

    }
}

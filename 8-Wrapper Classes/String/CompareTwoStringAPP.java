
/*Q13. Write a program to compare two strings.
 Input: String1- Java, String2- Java
 Output : Strings are equal */
import java.util.Scanner;

public class CompareTwoStringAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not equal");
        } else {
            int j = 0;
            boolean flag = false;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(j)) {
                    System.out.println("String are not equal: ");
                    flag = true;
                    break;
                }
                j++;
            }
            if (!flag) {
                System.out.println("Both Strings are Equal");
            }
        }

        sc.close();

    }
}

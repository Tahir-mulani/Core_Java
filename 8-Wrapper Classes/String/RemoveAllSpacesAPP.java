
/*Q16. Write a program to remove all spaces from a string.
 Input : Java Programming
 Output : JavaProgramming */
import java.util.*;

public class RemoveAllSpacesAPP {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        char result[] = str.toCharArray();
        int index = 0;

        for (int i = 0; i < result.length; i++) {
            if (result[i] != ' ') {
                result[index++] = result[i];
            }
        }

        System.out.println("After Removing all Spaces : ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

        String s = str.replace(" ", "");
        System.out.print("Using Method Remove All Spaces " + s);
        sc.close();

    }
}

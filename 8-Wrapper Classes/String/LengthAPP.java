
/*Q2. Write a program to find the length of a string.
 Input : Programming
 Output : 11
 */
import java.util.*;

public class LengthAPP {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        int count = 0;
        /*
         * // Using toCharArray()
         * for (char c : str.toCharArray()) {
         * count++;
         * }
         * System.out.println("Length " + count);
         */
        System.out.println("Length using Method " + str.length());

        // Using Exception Handeling
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("length (without method) :" + count);
        }

        // System.out.println("Length "+findLength(str));
        sc.close();
    }
    /*
     * Using Recursion
     * public static int findLength(String str){
     * if(str.equals("")){
     * return 0;
     * }
     * 
     * return 1 + findLength(str.substring(1));
     * }
     */
}

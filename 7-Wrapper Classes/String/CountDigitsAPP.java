/*Q15. Write a program to count digits in a string.
 Input : abc123
 Output : 3 */
 import java.util.*;
public class CountDigitsAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        char ch[] = str.toCharArray();
        int count =0;
        for(int i=0;i<ch.length;i++){
            if(ch[i] >= '1' && ch[i] <= '9'){
                count++;
            }
        }
        System.out.println("Given String there is "+count+" Digits");
        sc.close();
    }
}

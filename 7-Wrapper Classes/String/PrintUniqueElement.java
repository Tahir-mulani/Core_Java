/*Q22. Print only unique characters while maintaining original order.
 Input : banana
 Output : ban */
import java.util.*;
public class PrintUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

       Set<Character> set = new LinkedHashSet<>();
        
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character c : set){
            System.out.print(c);
        }
        sc.close();

    }
}

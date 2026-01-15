/*Q19. Write a program to count occurrence of a given character in a string.
  Input: programming, 
 	Character→ g
  Output: 2 */
  import java.util.*;
public class CountSingleCharacterAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String ");
        String str = sc.nextLine();

        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch ){
                count++;
                
            }
        }
        System.out.print("Given Character "+ch+" occurrence is "+count);
        sc.close();
    }
}

/*Q3. Write a program to count total characters in a string (excluding spaces).
 Input : Java Language
 Output : 12 */
import java.util.*;
public class CountcharaterAPP{
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        int count = 0;

      for(int i=0 ; ; i++){
        try{
            if(str.charAt(i) != ' ' ){
                count++;
            }
        } catch(Exception e){
            break;
        }
      }
      System.out.println(count);
      sc.close();
    }
    
}
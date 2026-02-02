/*Q23. Split the string into words and find the word with maximum length.
 Input : Java is very powerful
 Output : powerful */
 import java.util.*;
 public class SplitString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        String [] words = str.trim().split(" ");
        int max = 0;

        for(int i=1;i<words.length;i++){
            if(words[i].length() > max){
                max = i;
            }
        }
        System.out.println(words[max]);
        sc.close();
        
    }
 }
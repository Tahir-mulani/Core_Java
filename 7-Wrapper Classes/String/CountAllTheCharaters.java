/*Q21. Traverse the string and count how many times each character appears.
 Input : programming
 Output : p=1 r=2 o=1 g=2 a=1 m=2 i=1 n=1  */
 import java.util.*;
public class CountAllTheCharaters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = sc.nextLine();
        char c[] = str.toCharArray();

        boolean visited[] = new boolean[c.length];

        for(int i=0;i<c.length;i++){
            if(visited[i]){
                continue;
            }
            int count =1;

            for(int j = i+1;j<c.length;j++){
                if(c[i] == c[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(c[i]+" : "+count);
        } 
        sc.close();
    }
}

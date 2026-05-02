/*Q5. Write a java program to store list of strings in ArrayList and sort them based on string length.
Input : apple banana kiwi mango
Output:
kiwi
apple
mango
banana*/
import java.util.*;

public class Sort_By_String_Length {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple","banana","kiwi","mango"));

        // Bubble Sort (manual)
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){

                if(list.get(i).length() > list.get(j).length()){

                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        for(String s : list){
            System.out.println(s);
        }
    }
}
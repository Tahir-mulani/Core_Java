/*Q4. Write a java program to given a sentence, count frequency of each word using HashMap.
Input : java is easy java is powerful
Output: java=2 is=2 easy=1 powerful=1*/
import java.util.HashMap;
import java.util.Scanner;
public class Frequency_Each_Words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String str = sc.nextLine();
        String words[] = str.split(" ");

        //use HashMap store key = each word and value = frequency
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<words.length; i++)
        {
            if(map.containsKey(words[i])) //using key check element present or not
            {  
                int count = map.get(words[i]); //using key get map data
                map.put(words[i], count + 1);
            } 
            else
            {
                map.put(words[i], 1);
            }
        }

        // traverse key print frequency
        for(String key : map.keySet())
        {
            System.out.println(key + " = " + map.get(key));
        }

	}

}

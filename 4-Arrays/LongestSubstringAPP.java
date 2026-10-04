/*Write a Java program to find the longest substring without repeating characters 
and display both the substring and its length.
Example: Input: "abcabcbb" Output: Longest Substring: abc Length: 3*/
import java.util.Scanner;
public class LongestSubstringAPP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String str = sc.nextLine();

        findLongestSubstring(str);
    }

    public static void findLongestSubstring(String s) {

        int left = 0;
        int right = 0;

        int[] arr = new int[256];

        int maxLength = 0;
        int startIndex = 0;

        while (right < s.length()) {

            char currentChar = s.charAt(right);

            arr[currentChar]++;

            while (arr[currentChar] > 1) {

                char leftChar = s.charAt(left);

                arr[leftChar]--;

                left++;
            }

            int currentWindow = right - left + 1;

            if (currentWindow > maxLength) {

                maxLength = currentWindow;
                startIndex = left;
            }

            right++;
        }

        String result = s.substring(startIndex, startIndex + maxLength);

        System.out.println("Longest Substring: " + result);
        System.out.println("Length: " + maxLength);
    }
}
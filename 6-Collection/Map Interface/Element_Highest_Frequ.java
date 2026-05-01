/*Q1. Write a java program to find the element with highest frequency in an integer array using HashMap.
Input : Array: 1 2 2 3 3 3 4
Output: Element with highest frequency: 3 Frequency: 3*/
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Element_Highest_Frequ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter array element");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < size; i++) {
			if (map.containsKey(arr[i])) // check array element present in map key
			{
				int count = map.get(arr[i]); // get count if present
				map.put(arr[i], count + 1); // store key = array element and value = count
			} else {
				map.put(arr[i], 1);
			}
		}

		int max = 0, val = 0;
		// check max frequency
		for (int key : map.keySet()) // traverse the key(array element)
		{ 
			int value = map.get(key); // using key get the value(count);
			if (value > max) // check value(Count) > max
			{
				max = value;
				val = key;
			}
		}

		System.out.println("Element: " + val);
		System.out.println("Frequency: " + max);

	}

}

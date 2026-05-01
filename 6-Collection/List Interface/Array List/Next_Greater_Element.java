/*Q2. Write a java program to for each element, 
find next greater element to its right using ArrayList only.
Input: Array: 4 5 2 25
Output: 4 -> 5 5 -> 25 2 -> 25 25 -> -1*/
import java.util.ArrayList;
import java.util.Scanner;

public class Next_Greater_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter Array Element");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(arr[i]);
		}

		// Next greater Element
		for (int i = 0; i < list.size(); i++) {
			int next = -1;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) > list.get(i)) {
					next = list.get(j);
					break;
				}
			}
			System.out.println(list.get(i) + "->" + next);
		}
	}

}

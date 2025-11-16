/*
Q7. Write a Java program to implement binary search using function overloading. You must create two overloaded methods
with the same name binarySearch() that perform different operations:
int binarySearch(int[] arr, int key)
•This method should perform normal binary search on a sorted array.
•It should return the index of the key if found, otherwise return -1.
int binarySearch(int[] arr, int key, boolean first)
•This overloaded method must find the first occurrence of the key using recursion.
•If duplicates exist, it should return the leftmost index where the key appears.
*/
import java.util.Scanner;
public class Q7FunctionOverload
{
	public static void main(String[] args)
	{
		System.out.println("Enter Array size");
		int n =sc.nextInt();
		System.out.println("Enter Array element");
		int arr[] = new int[n];
		System.out.println("Enter key");
        int key = sc.nextInt();

        // Normal binary search
        int normalIndex = binarySearch(arr, key);

        // First occurrence binary search
        int firstIndex = binarySearch(arr, key, true);

        System.out.println("Normal Binary Search Index      : " + normalIndex);
        System.out.println("First Occurrence (Recursive)    : " + firstIndex);
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;

            else if (arr[mid] > key)
                high = mid - 1;

            else
                low = mid + 1;
        }
        return -1; // not found
    }

    // -------------------------
    // 2️⃣ First Occurrence (Recursive Binary Search)
    // -------------------------
    public static int binarySearch(int[] arr, int key, boolean first) {
        return firstOccurrence(arr, key, 0, arr.length - 1);
    }

    private static int firstOccurrence(int[] arr, int key, int low, int high) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            // check if this is the first occurrence
            int left = firstOccurrence(arr, key, low, mid - 1);
            return (left != -1) ? left : mid;
        }
        else if (arr[mid] > key) {
            return firstOccurrence(arr, key, low, mid - 1);
        }
        else {
            return firstOccurrence(arr, key, mid + 1, high);
        }
    }
    
}

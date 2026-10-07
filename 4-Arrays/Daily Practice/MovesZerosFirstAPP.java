 /*
Moves zeroes to first

Input  : [1, 0, 2, 0, 3, 4]
Output : [0, 0, 1, 2, 3, 4]
*/

public class MovesZerosFirstAPP {
    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 0, 3, 4};
        int n = arr.length;

        int k = 0;

        // Move all non-zero elements to the end
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }

        // Fill remaining positions with zero
        while (k < n) {
            arr[k] = 0;
            k++;
        }

        // Print array from reverse direction
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
Q6.Given a sorted array (may contain duplicates), find the first and last index of a given number x using binary search.
Example: arr = [2, 4, 4, 4, 6, 7, 9], x = 4 Output: First = 1, Last = 3
*/
import java.util.Scanner;
public class Q6DuplicateAPP
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array element(sorted element)");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter value of x");
		int x=sc.nextInt();
        
		int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);

        System.out.println("First = " + first);
        System.out.println("Last  = " + last);
    }
	
    public static int firstOccurrence(int arr[], int x)
	{
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high)
		{
            int mid = (low + high) / 2;

            if (arr[mid] == x)
			{
                first = mid;      // store answer
                high = mid - 1;   // go left
            } 
            else if (arr[mid] > x)
			{
                high = mid - 1;
            } 
            else
			{
                low = mid + 1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int arr[], int x)
	{
        int low = 0, high = arr.length - 1;
        int last = -1;

        while (low <= high) 
		{
            int mid = (low + high) / 2;

            if (arr[mid] == x)
			{
                last = mid;       // store answer
                low = mid + 1;    // go right
            } 
            else if (arr[mid] > x)
			{
                high = mid - 1;
            } 
            else
			{
                low = mid + 1;
            }
        }
        return last;
    }
}
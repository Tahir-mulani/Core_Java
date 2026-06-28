//Move all zeros to the end
import java.util.Scanner;
public class MoveAllZerosToEnd
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		findSecondSmallgestElement(arr);
	}
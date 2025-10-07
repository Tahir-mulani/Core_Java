/*Q1. Find Maximum Element in Array
Class: ArrayMax
Functions:
void inputArray(int arr[]) → take array input
int findMax() → display maximum element
int findMin() → display minimum element
Logic: Loop through array, compare each element, store max.
*/
import java.util.Scanner;
class MaxElement
{	int a[];    //instance variable.
	void inputArray(int arr[])
	{
		a=arr;  //arr is local variable.
	}
	int findMax()
	{
		int max =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	int findMin()
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	
}
public class MaxArrEle
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int m[] = new int[n];
		
		System.out.println("Enter array element");
		for(int i=0;i<m.length;i++)
		{
			m[i]=sc.nextInt();
		}
		
		MaxElement m1= new MaxElement();
		m1.inputArray(m);
		System.out.println("Maximum element is "+m1.findMax());	
		System.out.println("Minimum element is "+m1.findMin());
	}
}
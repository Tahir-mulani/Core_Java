/*
Q9. Write a java program to create a
Base class: ArrayOperation → contains two arrays Child class: ZigZagMerge → merge arrays in zig-zag manner:
Example: A1 = {11,22,33,44} A2 = {55,66,77,88}
Output: 11 55 22 66 33 77 44 88
*/
import java.util.Scanner;
class ArrayOperation
{
	int []A1;
	int []A2;
	public void acceptArrays(int n)
	{
		Scanner sc = new Scanner(System.in);
		A1= new int[n];
		A2= new int[n];
		
		System.out.println("enter first array element");	
		for(int i=0;i<n;i++)
		{
			A1[i]=sc.nextInt();
		}
		System.out.println("enter second array element");
		for(int i=0;i<n;i++)
		{
			A2[i]=sc.nextInt();
		}
	}
	
}
class ZigZagMerge extends ArrayOperation
{
	public void mergeZigZag() {
        System.out.println("Zig-Zag Merged Output:");

        for (int i = 0; i < A1.length; i++)
		{
            System.out.print(A1[i] + " ");
            System.out.print(A2[i] + " ");
        }
    }
}
public class Q9MergeTwoArrayAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		
        ZigZagMerge obj = new ZigZagMerge();
        obj.acceptArrays(n);
        obj.mergeZigZag();
	}		
}
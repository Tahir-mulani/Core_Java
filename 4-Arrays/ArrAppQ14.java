/*Q14. Write a java program to insert value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Value : 200       Output : 1 2 200 3 4 5 
*/

import java.util.Scanner;
public class ArrAppQ14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[6];
		System.out.println("Enter array element");
		for(int i=0;i<(a.length-1);i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("display array element");
		for(int i=0;i<(a.length-1);i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		
		//enter index and value
		System.out.println("Enter index and value");
		int index=sc.nextInt();
		int value=sc.nextInt();
		
			
		//for insert element  at specific index logic
		for(int i=(a.length-2);i>=index;i--)
		{
			a[i+1]=a[i];
				
		}
		a[index]=value;
		
		//display update array
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}
		
/*Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5
*/

import java.util.Scanner;
public class ArrAppQ15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[a.length-1];
		
		System.out.println("Enter array element");
		for( int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter index");
		int index=sc.nextInt();
		
		
		
		//delete value at specific index logic
		for(int i=0,j=0;i<a.length;i++)
		{
			if(i==index)
			{
				continue;
			}
			b[j++] = a[i];
			
		}
		
		//display array
		for(int j=0;j<b.length;j++)
		{
			System.out.printf("%d\t",b[j]);
		}
		
	}
}
	
		
		
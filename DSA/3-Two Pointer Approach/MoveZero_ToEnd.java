/*
Move Zeros to End
Move all 0s to the end of the array while maintaining the order of non-zero elements.
*/

import java.util.*;
public class MoveZero_ToEnd
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter limit");
		n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
				
		//move zero to end logic.
		int j=0,temp;
		for(int i=0;i<a.length;i++)
		{
			//find zero in array.
			if(a[i]!=0)    
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;//override to the end.
				j++;
			}
			
		}
		
		//print array.
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
	}
}
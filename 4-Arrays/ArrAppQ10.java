//Q10.Write a java program to check array is palindrome or not.

import java.util.Scanner;
public class ArrAppQ10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		//enter element given array
		System.out.println("Enter Array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();        // 1 2 3 2 1
		}
		System.out.println("-----------------------");
		
		//create new rev array for store reverse array
		int rev[]= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			rev[i]=a[a.length-1-i]; //1 2 3 2 1
			System.out.printf("%d\t",rev[i]);
		}
		
		//compare original array with reverse
		boolean flag=false;
		for(int i=0;i<=a.length;i++)
		{
			if(a[i]==rev[i])
			{
				flag=true;  
				break;
			}
		}

		
		if(flag){
			System.out.print("\npalindrome array");
		}
		else{
			System.out.print("\nnot palindrome");
		}
	
	}
}
		



		
		
/*
2.Check Palindrome Using Two Pointers
Check if a string is a palindrome using the two-pointer approach.
*/

import java.util.*;
public class Palindrome
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter limit ");
		String a[] = new int[] ;
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int left=0,right=(a.length-1);
		boolean flag=true;
		while(left<right)
		{
			if(a[left]!=a[right])
			{
				flag = false;
				break;
			}
			left++;
			right--;
		}
		String str=(flag)? "palindrom":"not palinrome";
		System.out.println(str);	
	}
	
}

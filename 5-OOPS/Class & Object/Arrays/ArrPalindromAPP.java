/*
Q12. Check Array is Palindrome or Not
Class: ArrayPalindrome
Functions:
void inputArray(int arr[])
boolean isPalindrome()
Logic: Compare arr[i] with arr[n-i-1].
*/

import java.util.*;
class ArrayPalindrome
{
	int a[];
	void inputArray(int arr[])
	{
		a=arr;
	}
	boolean isPalindrome()
	{
		int n=a.length;
		boolean flag = false;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==a[n-i-1])  
			{
				flag = true;
			}
			else
			{
				flag = false;
			}
		}
		return flag;
	}
}
public class ArrPalindromAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		ArrayPalindrome ap = new ArrayPalindrome();
		ap.inputArray(arr);
		if(ap.isPalindrome())
		{
			System.out.println("Array is palindrome");
		}
		else
		{
			System.out.println("Array is not palindrome");
		}
	}
}
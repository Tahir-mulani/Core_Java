/*Check if Two Strings Are Anagrams (Using Sorting and Two Pointers)
Check if two strings are anagrams using sorting and comparing via two pointers.
*/

import java.util.*;
public class AnagramsArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char a[]= s1.toCharArray();
		char b[]= s2.toCharArray();
		
		//sort array.
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		int i=0,j=0;
		boolean flag=true;
		while(i<a.length && j<b.length)
		{
			if(a[i]!=b[j])
			{
				flag=false;
				break;				
			}
			i++;
			j++;
		}
		
		if(flag)
		{
			System.out.println("Array is anagram");
		}
		else
		{
			System.out.println("Array is not anagram");
		}
	}
}
		
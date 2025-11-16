/*
Q4. Write a java program to find the frequency of each digit in a given integer using function recursion.
*/

import java.util.Scanner;
public class Q4FrequencyAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer Number");
		int n=sc.nextInt();
		int count=0;
		int freq[]=new int[10];
		
		recursion(n,freq);
		
		for(int i=0;i<10;i++)
		{
			if(freq[i]>0)
				System.out.println("Digit "+i+" =" +freq[i]+ " times");
		
		}
		
	}
	public static void recursion(int n,int freq[])
	{
		if(n==0)
			return;
		
		int digit=n%10;       //extract last digit
		freq[digit]++;      //increase count
		recursion(n/10,freq);     //reduce number
	}
}
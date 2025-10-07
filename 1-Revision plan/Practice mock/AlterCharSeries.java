/*Q3. Write a java program to print a series of alternating characters and numbers such that :
Input n=5;
Output :A 1 B 4 C 9 D 16 E 25.
*/

import java.util.Scanner;
public class AlterCharSeries
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n=5;//sc.nextInt();
		char ch='A';

		for(int i=1;i<=5;i++)
		{			
			int sq=i*i;
			System.out.printf("%c %d",ch,sq);
			ch++;	
		}
	}
}
		
		
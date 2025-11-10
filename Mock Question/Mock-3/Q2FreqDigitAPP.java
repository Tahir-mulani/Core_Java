//write a java program to find the frequency of each digit in a given integer.

import java.util.Scanner;
public class Q2FreqDigitAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int num=n;
		while(n!=0)
		{
			int digit=n%10;
			int temp=n/10;
			boolean flag=false;
			while(temp!=0)
			{
				if (temp % 10 == digit) {
                    flag = true;
                    break;
                }
                temp /= 10;
            }
			 if (!flag) {
                
                int count = 0;
                int temp2 = num;
                while (temp2 != 0) {
                    if (temp2 % 10 == digit)
                        count++;
                    temp2 /= 10;
                }
                System.out.println(digit + " frequency is: " + count);
            }
            n/= 10;
		}				
	}
}
	

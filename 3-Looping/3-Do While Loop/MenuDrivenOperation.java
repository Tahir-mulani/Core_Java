/*
Q2.Problem Statement:
 Write a menu-driven program using do-while and switch-case to:
1.Check if a number is prime.
2.Find the sum of digits of a number.
3.Reverse a number.
4.Exit.
Perform operations repeatedly until the user selects exit.
*/

import java.util.Scanner;
public class MenuDrivenOperation
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int ch;
		do{
			System.out.println("1.Check if a number is prime");
			System.out.println("2.Find Sum of digits of a number");
			System.out.println("3.Reverse Number");
			System.out.println("4.Exit");
			System.out.println("Enter choice");
			ch=sc.nextInt();
			switch(ch){
				
				case 1:
					System.out.println("Enter number");
					int num=sc.nextInt();
					int count=0;
					for(int i=1;i<=num;i++)
					{
						if(num%i==0){
							count++;
						}
					}
					if(count==2){
						System.out.println("Number is Prime");
					}else{
						System.out.println("Number is not Prime");
					}
					break;
				case 2:
					System.out.println("Enter Number");
					int n=sc.nextInt();
					int sum=0,rem=0;
					while(n!=0)
					{
						rem=n%10;
						sum=sum+rem;
						n=n/10;
					}
					System.out.println("Sum of digits of number is:"+sum);
					break;
				case 3:
					System.out.println("Enter Number");
					int a=sc.nextInt();
					while(a!=0){
						int rev=a%10;
						a=a/10;
						System.out.print(rev);
					}
					
					break;
				case 4:
					System.out.println("End of operation");
			}
			if(ch==4){
				break;
			}
		}while(true);
	}
}
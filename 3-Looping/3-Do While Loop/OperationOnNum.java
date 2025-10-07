/*
Q4. Write a menu-driven program using switch and do-while to perform operations on a single number:
1.Count the number of digits
2.Count how many digits are even
3.Find the product of all odd digits
4.Check if the number is an Armstrong number
5.Exit the program
*/

import java.util.*;
public class OperationOnNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n,ch,count;
		do{
			System.out.println("1.Count the number of digits");
			System.out.println("2.Count how many digits are even");
			System.out.println("3.Find the product of all odd digits");
			System.out.println("4.Check if the number is an Armstrong number");
			System.out.println("5.Exit the program");
			System.out.println("Enter Choice");
			ch=sc.nextInt();
			switch(ch){
				
				case 1:
					System.out.println("Enter Number");
					n=sc.nextInt();
					count=0;
					while(n!=0){
						n=n/10;
						count++;
					}
					System.out.println("digit of number is:"+count);
					break;
					
				case 2:
					System.out.println("Enter Number");
					n=sc.nextInt();
					count=0;
					while(n!=0){
						int rem=n%10;
						n=n/10;
						if(rem%2==0){
							count++;
						}
					}
					System.out.println(count+" Digits are even");
					break;
					
				case 3:
					System.out.println("Enter Number");
					n=sc.nextInt();
					int mul=1;
					while(n!=0){
						int l=n%10;
						if(l%2!=0){
							mul*=l;
						}
						n=n/10;
					}
					System.out.println(+mul);
					break;
			
				case 4:
					System.out.println("Enter a number");
					n=sc.nextInt();//153
					count=0;
					int temp=n;
					int sum=0;
					while(n!=0){
						count++;
						n=n/10;
					}
					n=temp;
					while(n!=0){
						int a=n%10; 
						int prod=1;
						for(int i=0;i<count;i++){
							prod=prod*a;
						}
						sum+=prod;
						n=n/10;
					}
					String str=(sum==temp)? "Number is Armstrong":"Number is not Armstrong";
					System.out.println(str);
					
					break;
				case 5:
					System.out.println("End Program!");
						break;
			   
			}
			if(ch==5){
					 break;
				 }
		}while(true);
	}
}
			
			
			


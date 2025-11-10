import java.util.Scanner;
public class MenuDrivenApp
{
	public static void main(String x[])
	{
		//take input from user
		Scanner sc=new Scanner(System.in);
		int choice;	
		//for choice we use ch variable	
		System.out.println("1. input any alphabet and check whether it is vowel or consonant.");
		System.out.println("2.Find the max number using 3 numbers.");
		System.out.println("3. input any number & check number is divisible by 5 & 11.");
		System.out.println("Enter choice between 1 to 3");
		choice=sc.nextInt();
		
		//using switch case
		switch(choice)
		{
			case 1:			   
				char ch;
				System.out.println("enter a character");
				ch=sc.next().charAt(0);
				if(ch>='A' && ch<='Z')
				{
					ch+=(int)+32;
				}
				String msg=(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')?"Vowel":"consonent";
				System.out.println("character is"+msg);
				break;
			case 2:
				int a,b,c;
				System.out.println("enter three numbers");
				a=sc.nextInt();
				b=sc.nextInt();
				c=sc.nextInt();
				String str=(a>b && a>c)? "a is Max":(b>a && b>c)?"b is Max":"c is Max";
				System.out.println(str);
				break;
			case 3:
				int n;
				System.out.println("enter number");
				n=sc.nextInt();
					if(n%5==0 && n%11==0)
					{
						System.out.println("Number is Divisible by 5 and 11");
					}
					else
					{
						System.out.println("Number is Not Divisible by 5 and 11");
					}
				
				break;
			
			default:
				System.out.println("Invalid Choice");
		}
	}
}
			
		
		
		
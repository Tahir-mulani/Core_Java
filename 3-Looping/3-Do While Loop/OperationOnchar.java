/*
Q3.Write a menu-driven program using switch and do-while to perform operations on a single character:
1.Check if the character is an alphabet.
2.If alphabet, check vowel or consonant.
3.If digit, check even or odd.
4.Convert uppercase to lowercase or vice versa.
5.Exit the program
*/

import java.util.Scanner;
public class OperationOnchar
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		char ch;
		
		do{
			System.out.println("1.check if the character is an alphabet");
			System.out.println("2.If alphabet, check vowel or consonant.");
			System.out.println("3.If digit, check even or odd.");
			System.out.println("4.Convert uppercase to lowercase or vice versa.");
			System.out.println("5.Exit program");
			System.out.println("-->Enter choice<--");
			n = sc.nextInt();
			
			switch(n){
				
				case 1:
					System.out.println("-->Enter Character<--");
					ch=sc.next().charAt(0);
					if(ch>='A' && ch<='z'){
						System.out.println("Character is Alphabet");
					}
					else{
						System.out.println("Character is not Alphabet");
					}
					break;
				case 2:
					System.out.println("-->Enter Character<--");
					ch=sc.next().charAt(0);
					if(ch>'A' && ch<='z'){
						if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
							System.out.println("Vowel");
						}else{
							System.out.println("Consonant");
						}
					}
						break;
					
				case 3:
					System.out.println("-->Enter Character<--");
					ch=sc.next().charAt(0);
					if(ch<='9' && ch>='0'){
						if(ch%2==0){
							System.out.println("digit is Even");
						}else{
								System.out.println("digit is odd");
						}
					}
					else{
						System.out.println("It's not a digit");
					}
					break;
				
				
				 case 4:
					System.out.println("-->Enter Character<--");
					ch=sc.next().charAt(0);
					if(ch>='A' && ch<='Z'){
						System.out.println("Upper to Lower case:"+(char)(ch+32));
					}else{
						System.out.println("Lower to Upper case:"+(char)(ch-32));
					}
					break;
					
						
						
			}
			if(n==5){
				System.out.println("Exit Program");
				break;
			}
		}while(true);
	}
}
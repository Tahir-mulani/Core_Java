//Q.55
import java.util.*;
public class To_Check_Vowel
{
 public static void main(String x[])
 {
      Scanner sc=new Scanner(System.in);
	  char ch;
	  System.out.println("Enter character from keyboard");
	  ch=sc.nextLine().charAt(0);
	  if(ch>=65 && ch<=90)
	  { ch=(char)(ch+32);
	  }
	  switch(ch)
	  {
	     case 'a','i','o','u','e':
		 
		 System.out.println("Vowel");
		 break;
		 default:
		  System.out.println("Consonent");
	  }
   }
}

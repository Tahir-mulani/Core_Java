//Q.53
import java.util.*;
public class Grade_Remark
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  char ch;
  
  System.out.println("enter Grade");
  ch=sc.nextLine().charAt(0);
  if(ch>=97 && ch <=122){
	  
	  ch =  (char)(ch-32);
  }
  
  
  switch(ch)
  {
    case 'A':
	System.out.println("Excellent");
	break;
	
	case 'B':
	System.out.println("Good");
	break;
	
	case 'C':
	System.out.println("Average");
	break;
	
	case 'D':
	System.out.println("Poor");
	break;
	
	case 'E':
	System.out.println("Fail");
	break;
	
	
	default:
	System.out.println("Invalid Input");
  }
 }
}
	
	
	
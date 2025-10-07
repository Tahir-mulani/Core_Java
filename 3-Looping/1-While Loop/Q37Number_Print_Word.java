//Q37. Write a java program to enter a number and print it in words.
import java.util.*;
public class Q37Number_Print_Word
{
 public static void main(String x[])
 {
  Scanner sc=new Scanner(System.in);
  int num,temp,rev=0;
  System.out.println("enter number");
  num=sc.nextInt();//456
  temp=num;
  //reverse number logic
   while(num!=0)
   {
    int rem=num%10;//6
	rev=rev*10+rem;
	num=num/10;
    }
       num=temp;
       while(rev>0)
       { 
         int d=rev%10;
	     switch(d)
	     {
           case 0:
           {
             System.out.println("ZERO\t");
			 break;
	       }		
	       case 1:
           {
             System.out.print("ONE\t");
			 break;
	       }		
	       case 2:
           {
              System.out.print("TWO\t");
			  break;
	       }		
	       case 3:
           {
              System.out.print("THREE\t");
			  break;
	       }		
	       case 4:
           {
              System.out.print("FOUR\t");
			  break;
	       }		
	       case 5:
           {
              System.out.print("FIVE\t");
			  break;
	       }		
	       case 6:
           {
              System.out.print("SIX\t");
			  break;
	       }	 	
	       case 7:
           {
              System.out.print("SEVEN\t");
			  break;
	       }		
	       case 8:
           {
              System.out.print("EIGHT\t");
			  break;
	       }
           case 9:
           {
              System.out.print("NINE\t");
			  break;
	       }
		   default:
		   System.out.println("Invalid");
	     }	
		 rev=rev/10;
		 if(num==0)
	     {
	         System.out.println("ZERO");
	      }
       } 
  }
}
    	
   
   
 
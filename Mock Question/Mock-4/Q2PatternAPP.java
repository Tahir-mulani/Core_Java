/*
Q2. Write a java program to print this pattern.
A 			  A
A B         B A
A B C     C B A
A B C D D C B A
A B C     C B A
A B         B A
A             A
*/
class Q2PatternAPP
{
    public static void main(String x[])
	{
       for(int i=1; i<=7; i++)
       {
           char ch = 'A';
           for(int j=1; j<=8; j++)
           {
               if((j<=i && i<=4) || (j<=8-i && i>4) && j<=4)
               {
                   System.out.print("  "+ch++);
               }
               else if((i>=9-j && i<=4) || (j>=i+1 && i>4) && j>4)
               {
                   System.out.print("  "+(--ch));
               }
               else
               {
                   System.out.print("   ");
               }
           }
           System.out.println();
       }
    }
}
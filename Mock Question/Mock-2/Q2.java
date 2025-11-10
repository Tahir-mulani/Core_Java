import java.util.Scanner;
public class Q2
{
	public static void main(String x[])
	{
		//User input method.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter nth number");
		int num=sc.nextInt();
		
		//loop for 1 to nth term.
		for(int n=1;n<=num;n++)
		{
			int temp=n;  //number store in temp because in this operation number become a zero.
			int sum=0;
			while(temp>0)
			{
				//extract the last digit.
				int digit=temp%10;   
				int fact=1;
				
				//find factors of digit.
				for(int i=1;i<=digit;i++) 		
				{
					fact=fact*i;        //factorial logic.
				}
				sum	=sum+fact;    //sum the factors of digit.
				temp=temp/10;     //delete last digit.
			}
			//compare factors sum with origial number.
			if(sum==n)
			{
				System.out.printf("%d\t",n); //print strong numbers.
			}
		}
	}
}
			

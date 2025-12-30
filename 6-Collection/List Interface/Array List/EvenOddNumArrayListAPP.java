/*
Q5. Store numbers in an ArrayList and count how many are even and how many are odd.
Explanation:
 This helps practice:
Modulus operator %
Condition-based counting
Iteration over collections
*/
import java.util.*;
public class EvenOddNumArrayListAPP
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter Element in ArrayList");
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		int eveCount = 0;
		int oddCount = 0;
		for(int i=0;i<list.size();i++)
		{
			if((int)list.get(i)%2==0)
			{
				eveCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Even Numbers "+eveCount+"\nOdd numbers "+oddCount);
		
	}
}
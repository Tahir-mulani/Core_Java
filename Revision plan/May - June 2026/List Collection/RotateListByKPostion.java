/*9. Rotate List by K Positions
Description
Rotate elements of a list to the right by K positions.
*/
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class RotateListByKPostion
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list size");
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter Element in list");
		for(int i=0;i<size;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("Enter K Position");
		int k = sc.nextInt();
		
		List<Integer> result = rotateByKPostion(list,k);
		for(int i: result)
		{
			System.out.print(i+" ");
		}
	}
	public static List<Integer> rotateByKPostion(List<Integer> list,int k)
	{
		int n = list.size();
        k = k % n;

        List<Integer> result = new ArrayList<>();

        for(int i = n - k; i < n; i++)
        {
            result.add(list.get(i));
        }

        for(int i = 0; i < n - k; i++)
        {
            result.add(list.get(i));
        }

		return result;
		
	}
}
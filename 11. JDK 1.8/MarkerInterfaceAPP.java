interface myMarker
{
}
class demo implements myMarker
{

}
public class MarkerInterfaceAPP
{
	public static void main(String x[])
	{
		if(demo instanceOf myMarker)
		{
			System.out.println("Student is marked");
		}
		else
		{
			System.out.println("Student is not marked");
		}
	}
}

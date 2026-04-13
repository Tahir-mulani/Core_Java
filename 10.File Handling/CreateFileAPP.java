import java.io.File;
import java.io.IOException;
public class CreateFileAPP
{
	public static void main(String x[])
	{
		File file = new File("D:\\demo.txt");
		try
		{
			if(file.createNewFile())
			{
				System.out.println("File is created : "+ file.getName());
			}
			else
			{
				System.out.println("File alredy exitsts");
			}
		} catch(IOException ex)
		{
			System.out.println(ex);
		}
	}
}
		
	
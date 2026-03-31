import java.io.*;
public class Create_FolderAPP
{
	public static void main(String x[])
	{
		File f = new File("D:\\demo");
		
		if(f.exists())
		{
			System.out.println("folder already exists");
		}
		else
		{
			boolean b = f.mkdir();
			if(b)
			{
				System.out.println("folder created successfully..");
			}
			else
			{
				System.out.println("Some problem is there......!");
			}
		}
	}
}
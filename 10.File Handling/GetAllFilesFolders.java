import java.io.File;
public class GetAllFilesFolders
{
	public static void main(String x[])
	{
		File f  = new File("D:\\Core Python");
		File fileList[] = f.listFiles();
		
		for(File f1:fileList)
		{
			if(f1.isFile())
			{
				System.out.println(f1);
			}
		}
	}
}
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class MakeFileStoreData
{
	public static void main(String x[]) throws IOException
	{
		FileWriter fw = new FileWriter("D:\\env project\\abc.txt",true);
		System.out.println("Enter data in file");
		String data = new Scanner(System.in).nextLine();
		
		fw.write(data);
		   fw.close();
		   System.out.println("data saved successfully....");
		
		
	}
}
		
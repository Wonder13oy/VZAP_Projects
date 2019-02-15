package vzap.wandile;
import java.io.*;
public class TestingFileClass
{

	public static void main(String[] args)
	{
		File file1 = new File("/wonderboy/Documents/Sept 2018");
		System.out.println("Is Sept2018 a directory? " + file1.isDirectory());
		System.out.println("is FirstPGM a file? " + file1.isFile());
		try
		{
			file1.createNewFile();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

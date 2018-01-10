package fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo1 
{
	public static void main(String[] k)
	{
		try 
		{
			FileInputStream fin=new FileInputStream("FileOutput1.txt");
			int i=0;
			
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("the exception is "+e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

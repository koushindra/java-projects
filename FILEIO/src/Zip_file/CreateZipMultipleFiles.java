package Zip_file;

import java.io.FileOutputStream;

public class CreateZipMultipleFiles 
{
	public static void main(String[] args)
	{
		try
		{
			String ZipFile="G:/FileIo/Zipdemo.zip";
			String[] SourceFiles={"G:/forzip/0028.png","G:/forzip/0029.png"};
			
			//create byte buffer
			byte[] buffer=new byte[1024];
			FileOutputStream fout= new FileOutputStream(ZipFile);
			
		}
		catch(Exception e)
		{
			
		}
	}
}

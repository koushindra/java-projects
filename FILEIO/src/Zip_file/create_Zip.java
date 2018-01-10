package Zip_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class create_Zip 
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("G:\\wio.zip");
		ZipOutputStream zout=new ZipOutputStream(fout);
		ZipEntry entry =new ZipEntry("nyyyy.jpg");
		zout.putNextEntry(entry);
		FileInputStream fin=new FileInputStream("vlc-record-2016-03-11-12h43m51s-AITBAAR NAHI KARNA.mp3-.mp3");
		int i=0;
		while((i=fin.read())!=-1)
		{
			zout.write(i);
		}
		System.out.println("zipping file is done!!!");
		fin.close();
		zout.closeEntry();
		zout.close();
		fout.close();
	}
}


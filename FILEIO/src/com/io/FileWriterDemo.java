package com.io;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//demonstrate the use of FileWriter
public class FileWriterDemo 
{
	public static void main(String[] args)throws IOException
	{
		FileWriter fw=new FileWriter("mno.txt");
		fw.write(100);
		fw.write("you");
		fw.write("\n");
		char [] ch1={'a','b'};
		fw.write(ch1);
		fw.flush();
		fw.close();
		
	}
}

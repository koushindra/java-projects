package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr= new FileReader("mno.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
		
	}
}//problem in my ;system is in fileWriter
// \n is not working in  fileWriter but it is working in FileReader

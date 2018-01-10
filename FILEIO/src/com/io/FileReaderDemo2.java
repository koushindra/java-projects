package com.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 
{
	public static void main(String[] args)throws IOException
	{
		File f=new File("abc.txt");
		
		char[] ch=new char[(int)f.length()];
		/* the method length() returns numbers of character  in file 
		in long format. here it is stored in a character arary(char [] ch )
		but long type of array cannot be stored in java.
		so f.length() is typecasted to int.	*/
		// LIKE AS char[] ch= new char[1000];
		FileReader fr=new FileReader(f);
		fr.read(ch);//reading characters from file and storing in character array ch.
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}
		
		fr.close();
	}
}

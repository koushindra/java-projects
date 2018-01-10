package com.io;
// PRINT ONLY FILES
import java.io.File;
public class PrintNames
{
	public static void main(String[] args)
	{
		int count=0;
		File f=new File("C:\\PRO");
		String[] s=f.list();
		for(String s1: s)
		{
			File f1=new File(f,s1);
			if(f1.isDirectory())
			{
			count++;
			System.out.println(s1);
		}
			}
		System.out.println("The total no :"+count);
	}
}
// HIDDEN FILES AND FOLDERS ARE ALSO PRINTED

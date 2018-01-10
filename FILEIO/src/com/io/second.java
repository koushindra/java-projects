package com.io;

import java.io.File;

public class second
{
	public static void main(String[] args)throws Exception
	{
	File f= new File("folder");
	f.mkdir();
try
{
	File f1=new File(f,"xyz.txt");
	f1.createNewFile();
	if(f1.exists())
		System.out.println("file xyz is created in folder");
	else
		System.out.println("file not created");
	
}
catch(Exception e)
{
	System.out.println("error in input");
}
}}
// output: file xyz is created in folder
// location: Z:\soft\eclips ide\workspace\FILEIO\folder

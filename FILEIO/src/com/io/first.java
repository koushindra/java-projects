package com.io;

import java.io.File;
/* creating a new directory */
public class first
{
	public static void main(String[] args) throws Exception
	{
		File f =new File("abcde");
		System.out.println(f.exists());
		
		f.mkdir();
		System.out.println(f.exists());
	}
}

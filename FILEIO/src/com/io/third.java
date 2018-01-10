package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class third 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("myfl.txt");
		fw.write("i am koushindra!!!\n");
		fw.write(66);
		System.out.println("file created successfully!!!");
		fw.close();
	}
}

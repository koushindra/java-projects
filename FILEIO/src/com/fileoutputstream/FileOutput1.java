package com.fileoutputstream;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileOutput1 {

	public static void main(String[] args) 
	{
			try 
			{
				FileOutputStream fout=new FileOutputStream("FileOutput1.txt");
				fout.write(65);
				fout.write(76434);
			
	/* Writing String to file*/
				String s=" \n  My name is Koushindra kumar\n";
				byte[] b1=s.getBytes();
				fout.write(b1);
				
				FileChannel f1=fout.getChannel();
				System.out.println("the channel is "+f1);
				
				FileDescriptor f2=fout.getFD();
				System.out.println("The discriptor is "+f2);
				
				fout.write(b1, 7, 8);
				
				
				fout.close();
				System.out.println("Successfully file is written");
			} 
			catch (FileNotFoundException e) 
			{
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}

package com.info.main;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Myclient 
{
	public static void main(String[] args)
	{
		try {
			Socket s = new Socket("localhost", 6666);
			
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			
			dos.writeUTF("Hello Server");
			dos.flush();
			dos.close();
			
			s.close();
		} 
		
		catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

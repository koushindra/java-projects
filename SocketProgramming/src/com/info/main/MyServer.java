package com.info.main;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {

		try{
			ServerSocket ss=new ServerSocket(6666);
			Socket s=ss.accept();
			
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str = (String)dis.readUTF();
			
			System.out.println("the message is "+str);
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println("the exception is "+e);
		}
	}

}

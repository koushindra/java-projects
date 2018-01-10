package com.info.main;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2 {

	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		Socket s=new Socket("localhost",3333);
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str1="", str2="";
		
		while(!str1.equals("stop"))
		{
			str1=br.readLine();
			dout.writeUTF(str1);
			dout.flush();
			
			str2=din.readUTF();
			System.out.println("Server Says: "+str2);
		}
		
		dout.close();
		s.close();
	}

}

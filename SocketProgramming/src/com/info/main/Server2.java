package com.info.main;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(3333);
		Socket s=ss.accept();
		
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str1="", str2="";
		
		while(!str1.equals("stop"))
		{
			str1=din.readUTF();
			System.out.println("client says: "+str1);
			
			str2=br.readLine();
			dout.flush();
		}
		din.close();
		s.close();
		ss.close();
	}

}

package com.info.main;

import java.nio.file.attribute.AclEntry.Builder;

public class Stringdemo 
{
	public static void  main(String[] args)
	{
		String name="Namit";
		int len=name.length();
		
		StringBuilder builder =new StringBuilder();
		for(int i=len-1; i>=0; i--)
		{
			char c=name.charAt(i);
			builder.append(c);
		}
		System.out.println("Resultant string is " +builder.toString());
		//builder=null;
	}
}

package com.info.main;

public class Performance_test 
{
	public static String m1()
	{
		String t="koushi";
		for(int i=0; i<50000; i++)
		{
			t=t+"koushi";
		}
		return t;
	}
	
	public static String m2()
	{
		StringBuffer sb=new StringBuffer("koushi");
		for(int i=0; i<50000; i++)
		{
			sb=sb.append("koushi");
		}
		return sb.toString();
	}
	public static String m3()
	{
		StringBuilder sb=new StringBuilder("koushi");
		for(int i=0; i<5000; i++)
		{
			sb.append("koushi");
		}
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		long startTime=System.currentTimeMillis();
		m1();
		System.out.println("Time taken by concatination by using String Class:   "+(System.currentTimeMillis()-startTime)+"ms");
	
		startTime=System.currentTimeMillis();
		m2();
		System.out.println("Time taken in concatination by using String BufferClass:   "+(System.currentTimeMillis()-startTime)+"ms");
	
		startTime=System.currentTimeMillis();
		m3();
		System.out.println("Time taken in concatination by using String BuilderClass:   "+(System.currentTimeMillis()-startTime)+"ms");
	
	}
}

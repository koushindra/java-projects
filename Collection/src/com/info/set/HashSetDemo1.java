package com.info.set;

import java.util.HashSet;

public class HashSetDemo1 
{
	public static void main(String[] args)
	{
		HashSet<Integer> rolls=new HashSet<>();
		rolls.add(453432342);
		rolls.add(462345);
		
	HashSet<Double>  rolls2=new HashSet<>();
	rolls2.add((double) 34);
	rolls2.add(2434.3);
	rolls2.add(2343.1234567891234567424242424234242425353534534535354343424242423432432242);// print 13 digits only after decimal
	
	for(Double d: rolls2)
	{
		System.out.println("double of rolls2: "+d);
	}
	/*
	for(float f:rolls2)  //Type mismatch: cannot convert from element type Double to float
	{						// becoz type of size of double is greater than size of flaot so double can not be stored into flaot
		System.out.println("flaot of rolls2:  "+f);
	}*/
		
		
		//cbs 1,8,16    (if,dbl) 32,64
		
		for(float x:rolls)    // integer can be stored in float because integer have 3 byte and float have also 32 byte
		{
			System.out.println("float: "+x);
		}
		
		for(int x:rolls)
		{
			System.out.println("int "+x);
		}
		
		for(long x:rolls)  // integer can be stored in integer bacause size of long(64 byte) is greater than integer 
		{
			System.out.println("long  "+x);
		}
		
		for(double x:rolls)  // size of double(64) is greater than size of integer .
		{
			System.out.println("double:  "+x);
		}
		
	/*	for(short x:rolls)  //Type mismatch: cannot convert from element type Integer to short
		{					// integer take 32 bit while short take 16 bit
			System.out.println("double:  "+x);
		}
		
		for(byte x:rolls)
		{
			System.out.println("byte : "+x);
		}*/

	}
}

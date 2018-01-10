package com.info.set;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args)
	{
		HashSet<String> names=new HashSet<>();
		names.add("koushi");
		names.add("Gill");
		names.add("Burg");
		
		System.out.println(names);
		
		System.out.println(names.size()); // prints number of elements
	}

}

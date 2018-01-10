package com.info.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo1 
{
	public static void main(String[] args)
	{
		Hashtable<Integer, String> employees=new Hashtable<>();
		employees.put(1000, "Sumit");
		employees.put(2000, "Burg");
		employees.put(3000, "Miller");
		
		System.out.println(employees); //{1000=Sumit, 2000=Burg, 3000=Miller}
		
		System.out.println("\n\n key-------------value");
		for(Map.Entry m: employees.entrySet())
		{
			System.out.println(m.getKey()+"            "+m.getValue());
		}
	}
}

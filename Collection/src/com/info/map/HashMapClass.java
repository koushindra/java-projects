package com.info.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {

		HashMap<Integer, String> students = new HashMap<>();
		students.put(1418710008, "Akash");
		students.put(1418710010, "Akash"); // use Ctrl+alt+down to copy paste line
		students.put(1418710038,"Brijesh Singh");
		students.put(1418710053,"Koushindra Kumar");
		students.put(1418710081,"Rajat");
		students.put(1518710906,"Manish Sharma");

		Set<Entry<Integer, String>> entries = students.entrySet();
		System.out.println("   Key"+"\t\t\t"+" Value");
		
		for(Entry<Integer, String> entry: entries)
		{
			Integer key= entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"\t\t"+value);
		}
		
	}

}

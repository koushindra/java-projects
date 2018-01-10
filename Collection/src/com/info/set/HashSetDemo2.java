package com.info.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2      // I.o--not  duplicacy---NO         null --yes
{
	public static void main(String[] args)
	{
		HashSet<Number> rolls=new HashSet<>();
		rolls.add(34324);
		rolls.add(898);
		rolls.add(898);       // will overwrite the previous 898
		rolls.add(null);		// one null value can be inserted
		rolls.add(null);      // previous null will be overwritten
		//rolls.add(0890809); //The literal 0890809 of type int is out of range 
	  //rolls.add(999890809);

		Iterator<Number> iter= rolls.iterator();
		
		while(iter.hasNext())
		{
			System.out.println("roll numbers are: "+iter.next());
		}
		
		HashSet<Integer> rolls2=new HashSet<>();
		rolls2.add(77);
		rolls2.add(88);
		
		//rolls2.addAll(rolls);  // here we are trying to add Number type(rolls) to Integer type(rolls2) and
		                    // WKT NUMBER is parent of INTEGER and parent class member cann't be added to child class
		
		rolls.addAll(rolls2);  // child class elements(Integer) can be added to parent class(Number)
		
		Iterator<Number> iterRolls=rolls.iterator();
		System.out.println("\nElements of rolls are:");
		while(iterRolls.hasNext())
		{
			System.out.println(iterRolls.next());
		}
	Iterator<Integer> iter2=	rolls2.iterator(); 
	System.out.println("\nElements of rolls2 are: ");
	while(iter2.hasNext())
	{
		System.out.println("rolls2 are : "+iter2.next());
	}
	}
}

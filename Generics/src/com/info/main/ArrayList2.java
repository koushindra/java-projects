 package com.info.main;

import java.util.ArrayList;

public class ArrayList2 
{
		public static void main (String[] args)
		{
			//ArrayList<String> names= new ArrayList();       
			ArrayList names=new ArrayList();
			names.add("Amit");
			names.add("Sumit");
			
			names.add("anil");
			names.add(3,"koushi");
			names.add(4,"kouhi4");
			names.add("ankit");
			names.add(6);
			
			names.add(null);
			System.out.println(names);
			
		// if we write this code in any text editor then after compile the code following notes will be given by the compiler
		/*	Note: GenericsDemo.java uses unchecked or unsafe operations.
			Note: Recompile with -Xlint:unchecked for details.*/

			
			/*for (String n: names)
				  System.out.println(n);*/
			
/*	Note: if we use line 10 instead of line 9 than we can add any type of elements in arraylist 
 * but if use only String type of elements than we can add only String type of elments 
*/			
		}

}

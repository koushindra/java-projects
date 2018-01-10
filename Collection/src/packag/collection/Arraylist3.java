package packag.collection;

import java.util.ArrayList;

public class Arraylist3 
{
	public static void main(String[] args)
	{
		ArrayList<String> names= new ArrayList<>();
		names.add("namit");
		names.add("Sumit");
		
		
      ArrayList<Number> salary=new ArrayList<>();  //  child class of NUMBER are INTEGER, SHORT , LONG, DOUBLE, FLOAT,  BYTE
		salary.add(45);    
		salary.add(874594343); // integer  
		salary.add(4563.34);  // float    
		salary.add(453535);// long
		
	ArrayList<Integer> id=new ArrayList<>();
	id.add(34);
	id.add(35);
	id.add(34);
	id.add(34);
		
	// Use of allAll() function
		names.addAll(names);   //size =4
		names.addAll(names);  //size = 8
		names.addAll(names); // size=16
		names.addAll(names); //size=32
		
		System.out.println(names);
		
	//	names.addAll(salary);  // show error becoz type parameter of salary is not child of type parameter of names 
	
		salary.addAll(id);    // Integer is child class of salary
		System.out.println("salary: "+salary);
		
		//	id.addAll(salary); // shows error because type parameter of salary is not child of type parameter of id
		
		
		// use of indexof() and lastindexof() function
		System.out.println("first index of 34 is:  "+id.indexOf(34));
		System.out.println("last index of 34 is : "+id.lastIndexOf(34));
		
		Object[] idarr=id.toArray();  // returns an array of Object type
		System.out.println("using toArray for id:   "+idarr); 
		
	     //using clone() function 	
	Object idcopy=id.clone();   
	id.clear();  // removes all elelment from id 
	System.out.println("Clone copy of id : "+idcopy);	
	System.out.println("Original copy of id:  "+id);
	
	
	ArrayList<Integer> roll=new ArrayList<>(5);
	roll.add(34);
	roll.add(35);
	
	
	
	
	}
}

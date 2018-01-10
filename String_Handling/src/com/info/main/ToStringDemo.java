package com.info.main;

public class ToStringDemo 
{
	int roll;
	String name;
	String city;
	
	public ToStringDemo(int roll, String name, String city)
	{
		this.roll=roll;
		this.name=name;
		this.city=city;
	}
	
	public String toString()     
	{
		// toString() method of Object class is overrided because everyclass implicity extends Object class
		return roll+"---"+name+"----"+city;
//above line work as -- return this.roll+"----"+this.name+"------"+this.city;
	}
	
	public static void main(String[] args)
	{
		ToStringDemo s=new ToStringDemo(44,"kouhsi","meerut");
		System.out.println(s.hashCode());
		
		System.out.println(s);// implicity to string method is called by jvm while printing any object 
		// compliler will convert this code as s.toString() as below
		System.out.print(s.toString());
		
		// toString method can be called by any class object becoz every class impilictly is child class of Object class
		// and child class can call any public method of parent class
		
	}
}

// toString() method inside String class is defined as 
/* 
public String toString() {
       return this;
   }*/

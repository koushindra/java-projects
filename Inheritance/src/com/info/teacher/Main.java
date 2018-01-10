package com.info.teacher;

public class Main 
{
	public static void main (String[] args)
	{
		Address addres=new Address("Meerut ", "34535","Merrut");
		Teacher emp=new Teacher(addres);
		emp.showT();
		
		
	}
}

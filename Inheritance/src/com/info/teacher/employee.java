package com.info.teacher;

public class employee
{
	int id=1001;
	String name="koushi";
	
	Address add;   // Aggregation--- because if a class has an instance member of object type , it is know to have Aggregation
			
	public employee(Address addrs) 
	{
		add=addrs;
	}
public void showE()
{
		System.out.println(" Id : "+id+"   Name : "+name);
		System.out.println(" City:  "+add.city+"    Pin:  "+add.pin+"    District: "+add.dist);
}
}

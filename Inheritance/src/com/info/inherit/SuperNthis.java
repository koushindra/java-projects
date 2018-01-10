package com.info.inherit;
// main user of super and this keyword is avoid confliction of variable
// second main use of super keyword is constructor chaining 

class B
{
	String name;
	int roll;
	int x=5000;
			B()
			{
				System.out.println("default const.----- Name:"+name+"    Roll is : "+roll);
			}
			B(String name, int roll)
			{ 
		    	this.name=name;     // confliction of same class variable 
				this.roll=roll;
				System.out.println("Hashcode in Parent class B:  "+this.hashCode());
				System.out.println("Parameterized const.----"+"Name is "+name+"   Roll is  "+roll+"\n");
			}
	
	// Note Parameterized constuctor and defalut const of a class, both can not executed simultaneously
	// either parametrized const or default const will be executed. it depends on calling of constructor
}

class A extends B
{
	String city;
	int x=5000;
	A(String name, int roll, String city)
	{
		super(name,roll);
	   
		super.name="xxx";  //   ??????????
	     super.roll=0000000;   //  ???????
	     //  super(name,roll);        // Error : call to super or Constructor call must be the first statement in a constructor
	System.out.println("Hashcode in child class  A: "+this.hashCode());	
	 
	this.city=city;
		System.out.println("A class--  Name "+name+"   Roll: "+roll+"   City: "+city);
		System.out.println("super.x="+super.x+"    this.x="+this.x+"\n");
	}
	
}
public class SuperNthis 
{
	public static void main(String args[])
	{
		A a =new A("koushi",53,"Meerut");
		B b=a;             // it is object sharing becoz both object is oprating on same memory location
		B b1=50;
		System.out.println("class name is: "+a.getClass());  // OUTPUT: class com.info.inherit.A
		System.out.println("class name is by toString() method:  "+a.toString()+"\n");    //com.info.inherit.A@15db9742
		
		System.out.println("Reference stored in a:  "+a);               // same as above
		System.out.println("Reference stord in b:   "+b1+"\n");
		
		System.out.println("Hashcode of a:  "+a.hashCode());
		System.out.println("Hashcode of b:  "+b1.hashCode());
		
		// while we are trying to make an object of child class the object of parent class will not be created
		//the constructor of parent class is called from inside of child class constructor without creating the object of child
		
	}
}

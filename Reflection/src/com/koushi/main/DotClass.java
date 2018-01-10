package com.koushi.main;

/*If a type is available but there is no instance then it is possible to obtain a Class by 
appending ".class" to the name of the type.It can be used for primitive data type also. */

public class DotClass 
{
	public static void main(String[] args)
	{
		Class c=float.class;
		System.out.println(c);

		Class c2=DotClass.class;
		System.out.println(c2);
		
	}
}
 
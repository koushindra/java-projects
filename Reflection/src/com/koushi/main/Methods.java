package com.koushi.main;
class C{
	
}
interface I{
	
}
public class Methods {

	public static void main(String[] args) throws ClassNotFoundException
	{

		Class c=Class.forName("com.koushi.main.C");
		System.out.println(c.isInterface());
		System.out.println(c.isInstance(c));
		System.out.println(c.isSynthetic());
		
		Class c1=Class.forName("com.koushi.main.I");
		System.out.println(c1.isInterface());
		System.out.println(c1.isInstance(c1));
		System.out.println(c1.isSynthetic());
	}

}

package com.info.main;
/*
A string that can be modified or changed is known as mutable string. 
StringBuffer and StringBuilder classes are used for creating mutable string.*/

public class String_Buffer 
{
	public static void main(String a[])
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.hashCode()+"  value is :"+sb);
		System.out.println("append()  :"+sb.append("koushi").hashCode()+" after append value  is "+sb);// mutable String because hashcode is same but value of String is changed
		System.out.println("insert()  :"+sb.insert(2, "xxxx"));  // offset starts with 1, here xxxx will be inserted after 2 offset/letters
		System.out.println("replace()  "+sb.replace(1, 4, "rrrrrrrrr")); // index 1,2 and 3 are replaced by specified string 
		System.out.println("delete()  "+sb.delete(1, 3)); // delete 1st and 2nd index, (end index in execlusive)
		System.out.println("reverse()  :"+sb.reverse()+"   value of sb is "+sb);
		System.out.println("capacity:  "+sb.capacity()+"   and length is "+sb.length());
		System.out.println(sb.append("dkfj lsad fjl; hjhdjdfdd")+"   AFTER APPEND -- "+"lengh is :"+sb.length()+"   and capacity is "+sb.capacity()); 
				//  if length<=16 => then capacity is 16; *** if  16<length<=34 then capacity is 34 
				// if length>34 then capacity=length;
		sb.ensureCapacity(39); 
											
												/*if(ensureCapacity<=oldCapacity)
													      newCapacity=oldcapacity
											   else
												         newCapacity=(oldCapacity*2)+2;*/
		// NOte:  StringBuffer class doesn't override the equals() method of Object class.
		System.out.println(sb.capacity());
		System.out.println();
		System.out.println();

	
	
	}
}

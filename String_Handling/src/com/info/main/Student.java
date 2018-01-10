package com.info.main;

public final class Student 
{
	 final String StudentId;
	Student(String Sid)
	{
		this.StudentId=Sid;
	}
	
	public String getId()
	{
		return StudentId;
	}
	
	public static void main(String[] arhgs)
	{
		Student st=new Student("koushi");
		System.out.println(st.hashCode());        //366712642
		System.out.println(st.getId().hashCode());    // -1125537917 (NEGATIVE HASHCODE)
		
		
	}
}

/* PROPERTIES OF IMMUTABLE CLASS
INSTANCE VARIABLE SHOULD BE FINAL(i.e UNMODIFIABLE) THAT MEANS VALUES OF VARIABLE SHOULD NOT BE CHANGED
class should be final (i.e. UNMODIFIABLE ) THAT MEANS CLASS SHOULD NOT BE INHERITED
NO SETTER METHOD SO THAT VALUE OF INSTANCE VARIABLES CAN NOT BE CHANGED
*/
package com.info.teacher;

public class Teacher extends employee
{
		public Teacher(Address addrs) {
		super(addrs);
		
	}

		String phone="353242354234";
		
		public void showT()
		{
			showE();
			System.out.println(" Phone: "+phone);
		}
}

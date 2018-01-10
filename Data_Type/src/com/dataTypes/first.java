package com.dataTypes;

import java.util.Scanner;

public class first 
{    public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your roll no.:");
		int roll = sc.nextInt();
		System.out.print("Enter your marks: ");
		double marks=sc.nextDouble();
		System.out.print("roll: "+roll+"   Name : "+name+"   Marks :"+marks);
   }
}
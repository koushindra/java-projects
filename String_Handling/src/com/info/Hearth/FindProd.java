package com.info.Hearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindProd
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the value: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line =br.readLine();
		System.out.println("line :"+line.length());
		
		int value=Integer.parseInt(line);
		System.out.println("value  :"+value);
		int rem=1;
		int product=1;
		for(int i=1; i<line.length(); i++)
		{
			/* rem=value%10;
			 value=value/10;
			 System.out.print(rem+" ");
			 
			product=product*rem;*/
			
		}
		System.out.println(product);
		
		
	}
}

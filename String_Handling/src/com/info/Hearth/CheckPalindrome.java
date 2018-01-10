package com.info.Hearth;

import java.util.Scanner;

public class CheckPalindrome 
{
	static boolean checkpalin(String palin)
	{
		boolean flag=true;
		
		int len=palin.length();
		
		/*for(int i=0; i<=(len/2); i++)
		{
			for(int j=len-1; j>i; j--)
			{
				if(palin.charAt(i)!= palin.charAt(j))
				{
					flag=false;	
				}
			}
		}
*/		

		
		for(int i=0,j=len-1; i<=(len/2); i++,j--)
		{
			
				if(palin.charAt(i)!= palin.charAt(j))
				{
					flag=false;
					
				}
			
		}
		return flag;
	}
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc =new Scanner(System.in);
		
		String palin=sc.next();
		
		boolean flag=checkpalin(palin);
		if(flag==false)
		System.out.println("NO");
		else
			System.out.println("YES");
		
		

	}

}

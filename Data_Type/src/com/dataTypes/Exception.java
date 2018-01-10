package com.dataTypes;

public class Exception 
{
	public static void main(String[] args)
	{
		try
		{
			int arr[] ={1,2,3,4};
			int i;
			for(i=0;i<=4; i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(java.lang.Exception e)
		{
			e.printStackTrace();
			System.out.println("there is no fifith element available");
		}
	}
}

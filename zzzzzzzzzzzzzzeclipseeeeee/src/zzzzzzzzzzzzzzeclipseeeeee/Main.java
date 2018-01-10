package zzzzzzzzzzzzzzeclipseeeeee;

import java.util.Scanner;

public class Main 
{
	 public static void main(String args[] ) throws Exception 
	    {
	        int[] A=new int[5];
	        int[] B=new int[5];
	        int[] C=new int[5];
	        Scanner sc =new Scanner(System.in);
	        for(int i=0; i<5; i++)
	        {
	        	System.out.println("Enter element of first array: ");
	  	             A[i]=sc.nextInt();
	        }
	        for(int i=0; i<5; i++)
	        {
	        	System.out.println("Enter element of second array: ");
	             B[i]=sc.nextInt();
	        }
	        
	        for(int i=0; i<5; i++)
	        {
	            C[i]=A[i]+B[i];
	        }
	     System.out.println(C[0]+" "+C[1]+" "+C[2]+" "+C[3]+" "+C[4]);
	    }
}

package dsft.exception_pro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class first
{
	public static void main(String args[])throws
	InputMismatchException,ArithmeticException {
	
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter first number:");
			int a=obj.nextInt();
			
			System.out.println("enter second number:");
			int b=obj.nextInt();
		
				int c=a/b;
				System.out.println("Result is:"+c);
				System.out.println("remaining code is continued");
			
		
	
}
}
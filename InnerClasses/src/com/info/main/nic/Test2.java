package com.info.main.nic;

// Nested inner classes
class Nic5  // if if declare Nic5 as public: Unresolved compilation problem: The public type Nic5 must be defined in its own file

{
    class Inner
    {
    	class Inner2  
    	{
    		public void m1()
    		{
    			System.out.println("Inner most class method");
    		}
    	}
    }
	
}

class Test2
{
	public static void main(String[] args)
	{
		new Nic5().new Inner().new Inner2().m1();
		
	}
	
}

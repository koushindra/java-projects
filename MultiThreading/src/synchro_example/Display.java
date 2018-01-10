package synchro_example;
  class Display 
  {
	  public synchronized void Displayn()
	  {
		  for(int i=0; i<10 ; i++)
		  {
			  System.out.print(i);
			  try{Thread.sleep(1000);}
				catch(InterruptedException e){  }
		  }
	  }
		  public synchronized  void Displayc()
		  { 
			  for(int i=65; i<90; i++)
		      {
				  System.out.print((char)i);
				  try{Thread.sleep(1000);}
					catch(InterruptedException e){  }
		      }
	      }  
}
 

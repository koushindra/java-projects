package dct.multi.pro;
// this program is single threaded
public class company 
{
	int[] account=new int[100];
	company()
	{
		for(int i=0; i<100; i++)
		{
			account[i]=1000;
		}
	}
	public synchronized void transfer(int from, int to, int amount)
	{
		
		System.out.println(amount+" Rs. is being transffered from"+from+"to  "+to);
		
		account[from]=account[from]-amount;
		try{Thread.sleep(1000);}
		catch(Exception e){  }
		account[to]=account[to]+amount;
	  
/*	public  void show_total()
	{
		int sum=0;
		for(int a: account)
		{
			sum=sum+a;
		}
		System.out.println("Total ammount of money:"+sum);
	}*/
}
}
package dsft.exception_pro;

public class ATM_withdrawal 
{
	public static void main(String[] args)
	{  
		/*InsufficientFundException e=new InsufficientFundException();
		Thread t1=new withdrawal(6000);
		t1.start();*/
	}
}
class withdrawal extends Thread
{
	double amount;
    double balance=5000;
	withdrawal(double amount)
	{
		this.amount=amount;
	}
	public void run()
	{
		/*if(amount>balance)
		   throw e;
		else
		{
			balance=balance-amount;
			System.out.println("Remaining balance is:"+balance);
		}*/
	}
}
package dct.multi.pro;
// this program is single threaded
public class company_main 
{
	public static void main(String[] args)
	{
		company c=new company();
		int from= (int)(100*Math.random());
		int to = (int)(100*Math.random());
		
		int amount=(int)(1000*Math.random());
		
		c.transfer(from, to, amount);
		//c.show_total();
	}
}

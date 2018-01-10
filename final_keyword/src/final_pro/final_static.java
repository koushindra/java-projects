package final_pro;
class circle
{
	double r;
	static  double PI;
// static  variable  have default value like as instance variable
	   circle(double r)
	   {
		   this.r=r;
	   }
	   public void Area()
	   {
		   System.out.println("Area is :"+PI*r*r);
	   }
}
public class final_static {
            public static void main(String[] jhfghjfd)
            {
            	circle c1= new circle(2.16);
            	c1.Area();
            }
}


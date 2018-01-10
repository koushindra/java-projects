package final_pro;
class Employee
{
	 final int id;
	  String name;
	  Employee(int id, String name)
	  {
		 this.id=id; // this is used with instance variable if instance 
		  this.name=name;  // variable has same name as constructor variable
	  }// final instance variable must be initialized in constructor
	  public void show()
	  {
		  System.out.println("Id: "+id+"  Name:"+name);
	  }
}
public class instance_final {
          public static void main(String[] args)
          {
        	 Employee emp= new Employee(1418710053, "koushindra");
        	  emp.show();
          }
}
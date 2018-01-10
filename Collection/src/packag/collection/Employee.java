package packag.collection;

public class Employee 
{
	int id;
	String name;
	public Employee(int id, String name)
	{
		super();
		this.id=id;
		this.name=name;
		
	}
	
	public boolean equals(Object obj)
	{
		if(obj==null)
				return false;
		
		if(this==obj)
				return true;
		
		if(getClass()!=obj.getClass())
					return false;
	
		Employee emp=(Employee)obj;
		return id==emp.id && name.equals(emp.name);
	  }
	
	public int hashCode()
	{
		return 7*new Integer(id).hashCode()+13*name.hashCode();
	}
	
	public void show()
	{
		System.out.println("Id:  "+id+"    Name:  "+name);
	}
}

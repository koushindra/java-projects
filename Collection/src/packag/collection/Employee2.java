package packag.collection;

public class Employee2 implements Comparable<Employee2>
{
	int id;
	String name;
	public Employee2(int id, String name)
	{
		super();
		this.id=id;
		this.name=name;
		
	}
	
	public void show()
	{
		System.out.println("Id;   "+id+"       Name:"+name);
		
	}
	public int compareTo(Employee2 emp)
	{
		return id-emp.id;
	}
}

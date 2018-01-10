package pack.inherit;

public class Employee
{
	int id;
	String name;
	Address add;
	
	Employee (int id, String name, Address address)
	{
		this.id=id;
		this.name=name;
		add=address;
	}
	
	public void show()
	{
		System.out.println("Id :  "+id+ "   Name :   "+name);
		System.out.println("city:  "+add.city+ "   Pin:  "+add.pin+"    State :  "+add.state);
	}
}

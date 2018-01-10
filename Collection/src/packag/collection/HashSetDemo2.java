package packag.collection;

import java.util.HashSet;

public class HashSetDemo2 
{
	public static void main(String[] args)
	{
		HashSet<Employee> emps = new HashSet<Employee>();
		emps.add(new Employee(1001,"Amit"));
		emps.add(new Employee(1002,"anit"));
		emps.add(new Employee(1003,"Namit"));
		emps.add(new Employee(1004,"Namit"));
		emps.add(new Employee(1001,"Amit"));
		for(Employee emp: emps)
		{
			emp.show();
		}
	}
}

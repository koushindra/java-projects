package packag.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo2
{
	public static void main(String[] args)
	{
		TreeSet<Employee2> emps = new TreeSet<>();
		emps.add(new Employee2(1001,"Amit"));
		emps.add(new Employee2(1002,"anit"));
		emps.add(new Employee2(1003,"Namit"));
		emps.add(new Employee2(1004,"Namit"));
		emps.add(new Employee2(1001,"Amit"));
		for(Employee2 emp: emps)
		{
			emp.show();
		}
   }
}

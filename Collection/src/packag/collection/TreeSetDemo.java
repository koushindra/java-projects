package packag.collection;

import java.util.TreeSet;

public class TreeSetDemo 
{
	public static void main(String[] args)
	{
		TreeSet<String> names= new TreeSet<>();
		names.add("A"); 
		names.add("B");
		names.add("aaa");
		names.add("Ab");
		names.add(null);
		for (String n: names)
		{
			System.out.println(n);
		}	
	}
}

package packag.collection;

import java.util.HashSet;

public class HashSetDemo 
{
	public static void main(String[] args)
	{
		HashSet<String> names = new HashSet<>();
		names.add("ankit");
		names.add("sumit");
		names.add("anil");
		names.add("koushi");
		//System.out.println(names);
		for(String n:names)
		{
			System.out.println(n);
		} 
		"ankit".equals("sumit");
	}
}

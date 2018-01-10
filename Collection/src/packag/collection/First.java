package packag.collection;

import java.util.ArrayList;

public class First {

	public static void main(String[] args) 
	{
		ArrayList <String> names =new ArrayList(); // generics is not used here
		names.add("Namit");//Type safety: The method add(Object) belongs to the 
		names.add("koushi");//raw type ArrayList. References to generic type 
		names.add("mahesh");//ArrayList<E> should be parameterized
		names.add("anil");
		//names.add(19);
	//	names.add(htr);  //error
		//System.out.println(names);
		for(String n: names)
		{
			System.out.println(n);
		} 
	 }
}

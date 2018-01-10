package packag.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*public boolean addAll(Collection c)
is used to insert the specified collection elements in the invoking collection.
*/

/*public boolean removeAll(Collection c)	
 is used to delete all the elements of specified collection from the invoking collection.
*/

/*public boolean retainAll(Collection c)	is used to delete all the elements of invoking collection except the specified collection.
*/

/*public boolean containsAll(Collection c)	is used to search the specified collection in this collection.
*/
/*public Object[] toArray()	converts collection into array.
*/
public class ArrayListDemo 
{
	public static void main (String[] args)
	{
		ArrayList<String> names= new ArrayList<>();
		names.add("namit");
		names.add("Sumit");
		names.add("anil");
		names.add("ankit");
		names.add("Sumit");      // duplicates are allowed and insertion order is preserved
		
		ArrayList<Number> salary=new ArrayList<>();  //  child class of NUMBER are INTEGER, SHORT , LONG, DOUBLE, FLOAT,  BYTE
		
		
		salary.add(45);    //
		salary.add(874594343); // integer   
		salary.add(4563.34);  // float    
		salary.add(453535);// long
		
		
	/*	for (String n: names)
		{
			  System.out.println(n);
		} /*
	/*	for(int i=0; i<names.size(); i++)
		{
			String n =names.get(i);
			System.out.println(n);
		}*/
		
		System.out.println("size ="+names.size());             // size =4
	Iterator<String> iter= names.iterator();
	System.out.println(names);                                //[namit, Sumit, anil, ankit]
	System.out.println(names.getClass());  					//class java.util.ArrayList
	
	System.out.println("value ofh iter= "+iter+"    value of iter.next()= "+iter.next());
	                    // iter holds the id of names object not element =  java.util.ArrayList$Itr@15db9742 
						// while iter.next() hold the value of first element at first time = namit
	System.out.println(iter.hasNext());
	while(iter.hasNext())
	{
		String n=iter.next();  // sumit,anit, ankit (not contains namit bacause iter.next() on line 31 already set the iterator on first element namit
		System.out.println(n);
	}
	
	names.remove("Sumit");   // only first copy will be removed 
	System.out.println(names.contains("Sumit")); //true-- because 2nd copy of Sumit is not Removed
	System.out.println(names);
	
	
	}
}

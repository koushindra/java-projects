package packag.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{
		public static void main(String[] args)
		{
			ArrayList<Integer> al=new ArrayList<>();
		for(int i=0; i<=10; i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		Iterator  iter= al.iterator();
		while(iter.hasNext())
		{
			Integer i=(Integer)iter.next();
			
			if(i%2==0)
				  System.out.println(i);
			else
				iter.remove();
		}
			
			System.out.println(al);
		}
}

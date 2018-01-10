package packag.collection;

import java.util.LinkedList;

public class LinkedLisDemo 
{
	public static void main (String[] args)
	{
		LinkedList<String> ll=new LinkedList<>();
			ll.add("ankit");
			ll.add("anil");
			ll.add("sunil");
		    ll.addFirst("addfirst");
		    ll.removeLast();
		    System.out.println(ll);
		    System.out.println(ll.getFirst()+"    "+ll.getLast());
		    System.out.println(ll.size());
		   System.out.println("removed all--- "+ll.removeAll(ll)); 
		   System.out.println(ll);
		
		   LinkedList<String> ll2= new  LinkedList<>();
		ll2.add("ll2 elements");
		   System.out.println("readded all---"+ll.addAll(ll2));
		   System.out.println(ll);
		    
		    
		    
		    
	}
}

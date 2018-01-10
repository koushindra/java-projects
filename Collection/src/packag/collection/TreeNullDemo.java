package packag.collection;

import java.util.TreeSet;

public class TreeNullDemo
{
   public static  void main(String[] args)
   {
	   TreeSet<String> t=new TreeSet<>();
	   t.add("A");
	   t.add("B");
	   t.add("a");
	   t.add(null);
	   
   }
}

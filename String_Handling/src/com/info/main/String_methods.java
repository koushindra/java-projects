package com.info.main;

public class String_methods 
{
	public static void main(String[] args)
	{
		String s1="koushi";
		String s4="KOUSHI";
		char ch[] ={'k','s','g','u','j','j','a','r'};
		String s2=new String(ch);
		String s3=new String("koushindra");
		System.out.println(s1+"\n"+s2+"\n"+s3);
		System.out.println(s1.charAt(3));
		System.out.println("length   "+s1.length());
		System.out.println("format   "+s1.format(s3, null));//?????????????????????
		System.out.println(s2.substring(1));
		System.out.println("contains   : "+s2.contains("sguj"));
		System.out.println("join  :  "+s2.join(s3, s2));
		System.out.println("  equals:   "+s1.equals(s3));
		System.out.println("isempty:  "+s1.isEmpty());
		System.out.println("concatinate:  "+s1.concat("dfa;lkfj"));
		System.out.println("concatinate  by + operator  :"+s1+5555);
		System.out.println("  replace: "+s1.replace("k", "aa"));
		System.out.println(" replace:  "+s1.replace("kous", "abcdefghi"));
		System.out.println("Substring  :"+s1.substring(0,3));  // start index : inclusive;   end index : exclusive
		System.out.println("Substring : "+s1.substring(2));
		System.out.println("uppercase and lowercase:  "+s1.toUpperCase()+"    "+s1.toLowerCase());
		System.out.println("startswith:  "+s1.startsWith("kou")); // returns boolean
		System.out.println("endswith:  "+s1.endsWith("bb"));     //returns boolean
		
		
		System.out.println(" **************************************************** ");
		System.out.println(" EQUAL "+s1.equals(s4)); // compare values of strings
		System.out.println(" EqualIgnore case:    "+s1.equalsIgnoreCase(s4));
		System.out.println(" Equal  : "+s1.equals(new String("koushi")));// true, because equals() method compare values of string not reference
		System.out.println(" == operator  :--> "+(s1=="koushi"));
		System.out.println("== operator  :-->  "+(s1==new String("koushi")));  //false because == operator compare references 
		System.out.println(" compareTo:   "+s1.compareTo(s4));  // 32 : because compareTo() method compares CONETENTS lexicographically(ONE BY ONE) AND returns integer by substracting ascii value of letter
		System.out.println(" compareToIgnoreCase: "+s1.compareToIgnoreCase(s4));  // 0
		System.out.println(" compareTo  : "+s1.compareTo("m")); // -2:  M-K
		System.out.println("  ");
		
		System.out.println(" split---->   "+s1.split(s2));
		System.out.println(" hashcode :"+s1.hashCode());
		System.out.println(" hashcode after concating:  "+s1.concat("  abcdefght").hashCode()+"   "+s1); 
		// ABOVE LINE SHOWS THAT STRING ARE IMMUTABLE i.e UNMODIFIABLE OR UNCHANGEABLE BECAUSE DIFFRENCE HASHCODE IS GENERATED 
		// AFTER MODIFYING/CONCATENATING THE STRING THAT MEANS A NEW OBJECT IS CREATED AFTER MODIFICATION and previous string s1 is same as previous
		System.out.println("  **********************************************************");
		
		 int s5=55;
		System.out.println(" valueOf  : "+"hashcode for new  string object : "+String.valueOf(s5).hashCode()+"    value of that string: "+String.valueOf(s5)); 
		// A string object is created in string constant pool
		//The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
	 	
	}
}

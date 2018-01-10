package packag.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
		public static void main(String[] args)
		{
			HashMap<String,String>  sts=new HashMap<>();
			sts.put("ENO.-1001", "Mark");
			sts.put("ENO.-1005", "Pole");
			sts.put("ENO.-1003", "Adem");
			sts.put("ENO.-1004", "Mark");
			sts.put("ENO.-1005", "Alex" );
		/*	Set<String>  keys= sts.keySet();
			
			for(String key: keys)
			{
				String value=sts.get(key);
				System.out.println(key+"  :  "+value);
				
			}*/  
			// or use 2nd way given below using Map.Entry interface
		Set<Map.Entry<String, String>> entries= sts.entrySet();
		/*for(Map.Entry<String, String> entry: entries)
		{
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"  :  " +value);
		}*/
		//or using iterator via map.entry
		Iterator<Map.Entry<String, String>> itr=  entries.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> entry=itr.next();
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"   :   "+value);	
		}
		}
}

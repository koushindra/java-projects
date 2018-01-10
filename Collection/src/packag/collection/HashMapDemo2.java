package packag.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.SpringLayout.Constraints;

public class HashMapDemo2
{
	public static void main(String[] args)
	{
		HashMap<String,String>  sts=new HashMap<>();
		sts.put("ENO.-1001", "Mark");
		sts.put("ENO.-1005", "Pole");
		sts.put("ENO.-1003", "Adem");
		sts.put("ENO.-1004", "Mark_Old");
		sts.put("ENO.-1005", "Alex" );  // Alex will raplace to Pole
		
		//System.out.println("ENO.-1007 exist ---"+sts.containsKey("ENO.-1007"));
		//System.out.println(sts.get("ENO.-1005") +"  exists---"+sts.containsValue("Alex"));
		
		Collection<String> values= sts.values();
	
		for(String value: values)
		{
			
			System.out.println(value);
		}
		
		HashMap<String,String>  newObj=new HashMap<>();
		
		newObj.put("ENO.-1008", "Adem");
		newObj.put("ENO.-1004", "Mark_New");
		
		newObj.putAll(sts);
		
		Set<Map.Entry<String, String>> entries= newObj.entrySet();
		for(Map.Entry<String, String> entry: entries)
		{
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"  :  " +value);
		}
		

	}
}

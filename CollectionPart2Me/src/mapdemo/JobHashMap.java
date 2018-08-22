package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class JobHashMap {

	
	public static void main(String[] args) {
	
		HashMap<String, String> hmap=
				new HashMap<String,String>();
		
		hmap.put("SA_REP", "Sales Rep");
		hmap.put("FI_ACC", "Accountant");
		hmap.put("SA_MAN", "Sales Manager");
		hmap.put(null, "Finance MAnager");
		
		//get values based on key
		
		String jobTitle=hmap.get("FI_ACC");
		System.out.println("Value at FI_ACC is : "+jobTitle);
		
		//Iterate over HashMap
		
		for (String key : hmap.keySet()) {
			System.out.println(key+" :: "+hmap.get(key));
		}

		//display content using iterator
		Set<String> set =hmap.keySet();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			String key=iterator.next();
			System.out.println("key is : "+key+" & values is : "+hmap.get(key));
		}
	}

}

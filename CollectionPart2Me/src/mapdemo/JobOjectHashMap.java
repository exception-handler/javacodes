package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class JobOjectHashMap {

	public static void main(String[] args) {
		//declare hashmap
		HashMap<String, Job> hmap=new HashMap<>();
		
		//adding elements
		hmap.put("SA_REP", new Job("Sales Rep", 10000, 100000));
		hmap.put("FI_ACCOUNT", new Job("Accountant", 5000, 50000));
		hmap.put("SA_MAN", new Job("Sales Manager", 15000, 150000));
		
		//display using iterator
		Set<String> set=hmap.keySet();//we need to make a set to keep keys
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			String key=iterator.next();
			System.out.println("Key is : "+key+" Value is : "+hmap.get(key));
		}
		//get value based on key
		Job job=hmap.get("FI_ACCOUNT");
		System.out.println("value at FI_ACCOUNT is"+job.title);
		
		//remove based on  key
		hmap.remove("FI_ACCOUNT");
		System.out.println(hmap.keySet());
	
	}

}

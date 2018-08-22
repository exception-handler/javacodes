package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> alist=new ArrayList<String>();
		//List<String> llist=new LinkedList<String>();
		alist.add("Ravic");// store the object
		alist.add("Ronak");
		alist.add("Deepak");
		
		
		//alist.add(10);
		//Integer i=(Integer)alist.get(1);
		// get index based read operation
System.out.println("Element by index index "+alist.get(0));
 
System.out.println("****Print By For***");
  for(int i=0;i<alist.size();i++)
  {
	  System.out.print(alist.get(i));
  }
  
  System.out.println("****Print By  ForEach***");
  for(String s:alist)
  {
	  System.out.print(s+" ");
  }
  System.out.println(" Printing Element using Iterator");
 
  Iterator<String> itr=alist.iterator();
  while(itr.hasNext())
  {
	  System.out.println(itr.next());
	
}
 		
	}

}

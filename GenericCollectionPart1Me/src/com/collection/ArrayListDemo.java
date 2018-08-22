package com.collection;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		List<String> alist=new ArrayList<String>();
		List<String> llist=new LinkedList<String>();
		
		
		alist.add("Ravic");//store the object
		alist.add("Ronak");
		alist.add("Deepak");
		
		llist.add("ROHIT");
		llist.add("RONAK");
		llist.add("DEEPAK");
		System.out.println("======through for each loop======");
		for (Object object : alist) {
			System.out.println(object);
		}
		
		
		System.out.println("======through for loop======");
		
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		
		/*
		Integer i=(Integer) alist.get(1);
		System.out.println(alist.get(1));*/
		System.out.println("===through iterator===");
		System.out.println("Element at 0 index is: "+alist.get(0));
		System.out.println("===through iterator===");
		
		ListIterator<String> itr=alist.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("=========through has previous=======");
	
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}

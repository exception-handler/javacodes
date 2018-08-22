package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> vect = new Vector<>();
		vect.add("Ravic");
		vect.add("Amit");
		System.out.println(vect.get(0));

		System.out.println("====through iterator=====");
		Iterator<String> vitr = vect.iterator();
		while (vitr.hasNext()) {
			System.out.println(vitr.next());
		}

		System.out.println("=====though enumeration====");
		Enumeration<String> evect=vect.elements();
		while(evect.hasMoreElements())
		{
			System.out.println(evect.nextElement());
		}
		
		System.out.println("====== through for each loop======");
		for (String string : vect) {
			System.out.println(string);
		}
	}

}

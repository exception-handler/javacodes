package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	Vector<String> vect=new Vector<>();
	vect.add("Ravic");
	vect.add("Amit");
	System.out.println("Element at 0 "+vect.get(0));
	System.out.println("Displaying element using Iterator");
	Iterator<String> vitr=vect.iterator();
	while(vitr.hasNext())
	{
		System.out.println(vitr.next());
	}

System.out.println("Displaying element using Enumeration");
Enumeration<String> evect= vect.elements();
while(evect.hasMoreElements())
{
	System.out.println(evect.nextElement());
}
	
	}

}
 
package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
	public static void main(String[] args) {
	ArrayList<String> alist=new ArrayList<>();
	alist.add("Ravic");
	alist.add("Amit");
	alist.add("Harshit");
	System.out.println(" Element without sorting"+alist);
	Collections.sort(alist);
	System.out.println(" Element After sorting"+alist);
	Collections.sort(alist,Collections.reverseOrder());
	System.out.println(" Element After sorting in "
			+ "reverse Order"+alist);
	Collections.reverse(alist);
	System.out.println(" Element After Reversing"+alist);
	
	}

}

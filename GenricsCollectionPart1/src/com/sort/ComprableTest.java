package com.sort;

import java.util.ArrayList;
import java.util.Collections;

public class ComprableTest {

	public static void main(String[] args) {
		ArrayList<Employee1> al=new ArrayList<Employee1>();
		al.add(new Employee1(101, "Ravic", 30));
		al.add(new Employee1(102, "Amit", 21));
		System.out.println("Element befor sorting");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("Element After sorting");
		System.out.println(al);

	}

}

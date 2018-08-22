package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PersonStream {

	public static void main(String[] args) {
		
		List<Person> alist=new ArrayList<>();
		alist.add(new Person("Rohit", 25));
		alist.add(new Person("Mohit",26));
		Stream<Person> spr=alist.stream();
		spr.forEach(System.out::println);
	}

}

package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BuildStream {

	public static void main(String[] args) {
		Stream<Integer> stream1=Stream.of(20,30,40);
		Stream<Integer> stream2=Stream.of(new Integer[]{30,40,50});
		ArrayList<Integer> alist=new ArrayList<>();
		stream1.forEach(i->System.out.println(i));
		stream2.forEach((System.out::println));
		for (int i = 0; i <= 5; i++) {
			alist.add(i);
		}
		
		Stream<Integer> stream3=alist.stream();
		stream3.forEach(System.out::println);
		//stream3.forEach(System.out::println);
		alist.stream().forEach(System.out::println);

	}

}

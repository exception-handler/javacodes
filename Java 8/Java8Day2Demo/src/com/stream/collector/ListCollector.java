package com.stream.collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListCollector {
	public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
       List<Integer> squares = numbers.stream()
    		   .map( i -> i*i).collect(Collectors.toList());
  System.out.println("Original list of numbers : " + numbers);
   System.out.println("Transformed list of integers"
         		+ " using Map in Java 8 : " + squares);
	}
}

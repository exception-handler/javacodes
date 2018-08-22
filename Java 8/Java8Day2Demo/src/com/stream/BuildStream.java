package com.stream;

import java.util.stream.*;
import java.util.*;
public class BuildStream {
 public static void main(String[] args){
 Stream<Integer> stream1= Stream.of(20,30,40);
 ArrayList<Integer> alist=new ArrayList<>();
 Stream<Integer> stream2= Stream.of(new Integer[]{30,40,50});
 for (int i=1;i<=5;i++)
 {
	 alist.add(i);
	 
 }
 stream1.forEach(i->System.out.println(i));
 stream2.forEach(System.out::println);
 Stream<Integer> stream3= alist.stream();
stream3.forEach(System.out::println);
//stream3.forEach(System.out::println);
alist.stream().filter(i->i>3).forEach(System.out::println);
	 
     }
}

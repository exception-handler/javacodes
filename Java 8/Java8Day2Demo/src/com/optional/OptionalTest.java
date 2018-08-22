package com.optional;
import java.util.Optional;
import java.util.stream.Stream;
public class OptionalTest {
public static void main(String[] args) {
Stream<String> names = Stream.of("Amit", "Ravi", "Mohit","Ajay");
Optional<String> firstLetter = names.filter	(name -> name.startsWith("A"))
                      .findFirst();
   	   if (firstLetter.isPresent())
		  {
			String str=firstLetter.get();
			System.out.println(str);
			  }
		
 firstLetter.ifPresent((name) -> {
 String s = name.toUpperCase();
 System.out.println("The first name to begin with A is "+ s);
		        });
	   	 
    	  // Remove Boiler Plate code
firstLetter.map(i->i.toUpperCase()).ifPresent(i->System.out.println(i));
	}
}

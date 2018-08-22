package com.stream.reduce;
import java.util.*;
import java.util.stream.*;
class StreamTerminalOperation
{
public static void main(String...args)
{
List<String> memberNames = new ArrayList<>();
memberNames.add("Amitabh");
memberNames.add("Shekhar");
memberNames.add("Aman");
memberNames.add("Rahul");
memberNames.add("Lokesh");
boolean matchedResult = memberNames.stream()
         .anyMatch((s) -> s.startsWith("A"));
System.out.println(matchedResult);

String firstMatchedName = memberNames.stream()
            .filter((s) -> s.startsWith("A"))
            .findFirst().get();
 
System.out.println(firstMatchedName);
}
}

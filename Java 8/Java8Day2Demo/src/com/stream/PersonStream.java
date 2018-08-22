package com.stream;
import java.util.*;
import java.util.stream.*;
class PersonStream
{
public static void main(String args[])
{
ArrayList<Person> plist=new ArrayList<>();
plist.add(new Person("Ravic", 30));
plist.add(new Person("Amit", 20));
Stream<Person> pstraem=plist.stream();
pstraem.forEach
(person->System.out.println(person.getName()+" "+
person.getAge()));
}
}
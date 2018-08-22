/**
 * 
 */
package com.infogain.setdemo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
public class SetComparisonDemo {
	/**
	 * @param args
	 */
public static void main(String[] args) {
HashSet<String> stringOne=new HashSet<>();
LinkedHashSet<String> stringTwo=new LinkedHashSet<>();
TreeSet< String> stringThree=new TreeSet<>();
String aclist[]={"NetApp","Apple","Samsung"};
for(String al:aclist)
{
	stringOne.add(al);
	stringTwo.add(al);
	stringThree.add(al);
}
System.out.println("No order "+stringOne);
System.out.println("With  order "+stringTwo);
System.out.println("Sorted Element "+stringThree);
System.out.println("Elements using Iterator");
Iterator<String> itr= stringThree.iterator();
while(itr.hasNext())
{
	System.out.print(itr.next()+" ");
}

}
	
}

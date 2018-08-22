package setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetComparisonDemo {

	public static void main(String[] args) {
		
		HashSet<String> stringOne=new HashSet<>();
		LinkedHashSet<String> stringTwo=new LinkedHashSet<>();
		TreeSet<String> stringThree=new TreeSet<>();
		String[] aclist={"NetApp","Apple","Samsung","FedEx"};
		for (String string : aclist) {
			stringOne.add(string);
			stringTwo.add(string);
			stringThree.add(string);
		}
		
		System.out.println("No order"+stringOne);//random order in HashSet
		System.out.println("With order"+stringTwo);//insertion order in LinkedHashSet
		System.out.println("Sorted Elements"+stringThree);//Sorted order in TreeSet
		
		
		System.out.println("======elements using iterator=======");
		Iterator<String> itr=stringOne.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}

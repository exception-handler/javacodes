package com.stream;

import java.util.ArrayList;
import java.util.List;

public class streamTerminal {

	public static void main(String[] args) {
		List<String> memberNames=new ArrayList<>();
	
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Amit");
		memberNames.add("Ragul");
		memberNames.add("Lokesh");
		memberNames.add("Amitansh");
		boolean matchedResult =memberNames.stream().anyMatch((s)->s.startsWith("A"));
		System.out.println(matchedResult);
		
		String firstMatchedName=memberNames.stream().filter((s)->s.startsWith("A")).findAny().get();
		System.out.println(firstMatchedName);
		

	}

}

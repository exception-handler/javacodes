package com.defaulttest;

public interface Person {
	void print();
 default void sayHello()
	{
		System.out.println(" Say hello....");
	}
 
  static void printAge()
   {
	   System.out.println(" Age is 20");
   }

}

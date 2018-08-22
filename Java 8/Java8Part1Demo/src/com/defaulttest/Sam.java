package com.defaulttest;

public class Sam implements Person {
	@Override
	public void print() {
	System.out.println(" Print method of Sam Class");
		
	}
	@Override
	public void sayHello()
	{
	Person.printAge();
 System.out.println(" Say hello Overriden in sam class....");
		
	}
	
	/*@Override
	static void printAge()
	   {
		   System.out.println(" Age is 20");
	   }
	*/
	
}

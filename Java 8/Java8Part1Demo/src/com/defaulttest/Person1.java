package com.defaulttest;

public interface Person1 {
	default void sayHello()
	{
		System.out.println(" Say hello....");
	}

}

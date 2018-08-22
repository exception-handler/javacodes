package com.generics;

public class GenericConstructor<T> {
	T t;
	
	public GenericConstructor(T t) {
		super();
		this.t = t;
	}

	public GenericConstructor() {
		// TODO Auto-generated constructor stub
	}
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
public static void main(String[] args) {
GenericConstructor<String> gcs=
new GenericConstructor<>("Ravic");
GenericConstructor<Integer> gci=
new GenericConstructor<>(101);
System.out.println(" Object Value "+gcs.getT());
System.out.println(" Object Value "+gci.getT());
	}
}

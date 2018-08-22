package com.generics;

public class GenericContainer<T> {
	T obj;
	
	public T getObj() {
		return obj;
	}



	public void setObj(T obj) {
		this.obj = obj;
	}



	public static void main(String[] args) {
	GenericContainer<String>  gcs=new GenericContainer<>();
	GenericContainer<Integer>  gci=new GenericContainer<>();
	gcs.setObj("Ravic");
	String s=gcs.getObj();
	System.out.println("String Object "+s);
	//gcs.setObj(10);//CE
	
	gci.setObj(new Integer(101));
	System.out.println("Integer Object "+gci.getObj());
	
	

	}

}

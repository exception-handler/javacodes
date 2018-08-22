package com.generics;

public class ObjectContainer {
	private Object obj;
		
		public Object getObj() {
		return obj;
	}


	public void setObj(Object obj) {
		this.obj = obj;
	}
	public static void main(String[] args) {
	ObjectContainer obj1=new ObjectContainer();
	obj1.setObj("Ravic");
	System.out.println("String Objecet is "+obj1.getObj());
   obj1.setObj(10);
    Integer i=(Integer)obj1.getObj();// Type Cast
    System.out.println("Integer "+i);
   
   }

}

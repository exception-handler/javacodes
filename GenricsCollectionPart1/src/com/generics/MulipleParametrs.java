package com.generics;
public class MulipleParametrs<T ,U> {
	T t;
	U u;
	
	public MulipleParametrs(T t, U u) {
		super();
		this.t = t;
		this.u = u;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}



	public U getU() {
		return u;
	}

	public void setU(U u) {
		this.u = u;
	}

	public static void main(String[] args) {
		MulipleParametrs<Integer, String> emp1=
		new MulipleParametrs<Integer, String>(101, "Rohit") ;
		MulipleParametrs<Integer, String> emp2=
		new MulipleParametrs<Integer, String>(102, "Ajay") ;
System.out.println("Emp Id "+emp1.getT()+""
		+ " Emp Name "+emp1.getU());
System.out.println("Emp Id "+emp2.getT()+" "
		+ "Emp Name "+emp2.getU());
	}

}

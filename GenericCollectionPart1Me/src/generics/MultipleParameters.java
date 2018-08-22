package generics;

public class MultipleParameters<T,U> {

	T t;
	U u;
	
	
	public MultipleParameters(T t, U u) {
		super();
		this.t = t;
		this.u = u;
	}
	
	public MultipleParameters() {
		// TODO Auto-generated constructor stub
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
		
		MultipleParameters<Integer, String> emp1=
				new MultipleParameters<>(101,"ROHIT");
		
		MultipleParameters<Integer, String> emp2=
				new MultipleParameters<>(102,"RAVIC");
	
		System.out.println("the id of emp1 is :"+emp1.getT()+"  The name of emp1 is: "+emp1.getU());
		
		System.out.println("the id of emp2 is :"+emp2.getT()+"  The name of emp2 is: "+emp2.getU());
			
	}//main end

}//class end

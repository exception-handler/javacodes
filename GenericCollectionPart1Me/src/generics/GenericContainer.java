package generics;
//convert this class as generic class
public class GenericContainer<T> {

	T obj;
	
	
	public T getObj() {
		return obj;
	}


	public void setObj(T obj) {
		this.obj = obj;
	}


	public static void main(String[] args) {
		
		//it will hold String
		GenericContainer<String> gcs=new GenericContainer<>();
		GenericContainer<Integer> gci=new GenericContainer<>();
		GenericContainer<Integer> gci1=new GenericContainer<>();
		
		gcs.setObj("Ravic");
		System.out.println("String is: "+gcs.getObj());
		
		//checking at compile time
		gci.setObj(new Integer(101));
		System.out.println("Integer is: "+gci.getObj());
		
		//auto boxing
		gci1.setObj(101);
		System.out.println(gci1.getObj());
		//JDK 1.5 THERE IS SUPPORT FOR  BOXING UNBOXING
	}

}

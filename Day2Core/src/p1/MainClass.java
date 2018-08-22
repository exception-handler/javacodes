package p1;
//create a class
class Employee{
	
	int id;
	String name;
}

public class MainClass {

	public static void main(String[] args) {
	
		MainClass obj = new MainClass();//to call functions of same class itself
		//not required if other methods are static
		
		Employee e=new Employee();
		e.id = 101;
		e.name = "mike";
		
		obj.printEmployee(e);
		
		Employee e1=new Employee();
		e1.id = 102;
		e1.name = "jerry";
		
		
	}//end main
	
	public void printEmployee(Employee e){
		System.out.println(" Empoyee ID : "+e.id);
		System.out.println(" Employee name : "+e.name);
		
	}//printEmployee ends

}//end class

package ans5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintEmployeeInfo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(101, "Rohit"));
		empList.add(new Employee(102, "Abhi"));
		
		Consumer<Employee> c=(Employee e)->System.out.println(e);
		empList.forEach(c);
	
	Consumer<Employee> c1= new Consumer<Employee>() {

		@Override
		public void accept(Employee t) {
			
			System.out.println(t.getEid()+t.getName());
			
		}
		
	};
	empList.forEach(c1);
	
	/*for (Employee employee : empList) {
		c1.accept(employee);
	}*/
	
	}
	

}

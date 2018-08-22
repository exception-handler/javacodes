package ans1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee("Rohit", "IT", 1000000));
		empList.add(new Employee("abhi", "HR", 150000));
		empList.add(new Employee("vipin", "FINANCE", 200000));
		empList.add(new Employee("deepak", "ACCOUNTS", 100000));
		
		Stream<Employee> st=empList.stream();
		st.forEach(System.out::println);
		//System.out.println("------------------------------");
		//empList.stream().forEach(e->System.out.println(e.getName()+" "+e.getSalary()+" "+e.getDept()));
		//
		//System.out.println("----------------------------");
		//empList.forEach(System.out::println);
		
		//st.filter(e->e.getName().endsWith("k")).forEach(System.out::println);
	}

}


/*

   for(Consumer<T> cons:arr)
   {
       cons.accept(cons);
   }
   
   public static void accept(Consumer<T> cons)
   {
      sysout(cons);
   }

*/
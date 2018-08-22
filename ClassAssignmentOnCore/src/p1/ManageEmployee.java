package p1;

public class ManageEmployee {
	static Employee emp[]=new Employee[3];
	

	static{
		/*RegularEmp re=new RegularEmp(101, "Rohit", 10, 15000, "Regular");
		emp[0]=re;
		RegularEmp re1=new RegularEmp(102, "Chetan", 10, 17000, "Regular");
		emp[1]=re1;
		ContractEmp ce=new ContractEmp(103, "Mohit", 10, 20000, "Contract");
		emp[2]=ce;*/
		
		emp[0]=new RegularEmp(101, "Rohit", 10, 17000, "Regular");
		emp[1]=new RegularEmp(102, "Chetan", 10, 17000, "Regular");
		emp[2]=new ContractEmp(103, "Mohit", 10, 17000, "Contract");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<3;i++)
		{
			emp[i].print();
		}
		
		System.out.println("=====USING FOR EACH LOOP=====");
		
		for (Employee emp : emp) {
			emp.print();
		}
	}
	
	

	
}

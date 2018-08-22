package ans3;

public class Employee {

	private String name;
	private char gender;
	private String designation;
	private double yearsOfExp;
	private double basicSalary;
	private String status;

	public double promoteEmp() {
		if(getDesignation()=="ASE")
		{
			setDesignation("ITA");
			setBasicSalary(getBasicSalary()*1.05);
		}
		if(getDesignation()=="ITA")
		{
			setDesignation("AST");
			setBasicSalary(getBasicSalary()*1.08);
		}
		if(getDesignation()=="AST")
		{
			setDesignation("ASC");
			setBasicSalary(getBasicSalary()*1.10);
		}
		
		return basicSalary;
	}

	public Employee() {
		super();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getYearsOfExp() {
		return yearsOfExp;
	}

	public void setYearsOfExp(double yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee(String name, char gender, double yearsOfExp) {
		super();
		if(yearsOfExp>=3){
		this.name = name;
		this.gender = gender;
		this.designation = "ITA";
		this.yearsOfExp = yearsOfExp;
		this.basicSalary = 15000;
		this.status = "Active";}
		else
		{
			this.name = name;
		this.gender = gender;
		this.designation = "ASE";
		this.yearsOfExp = yearsOfExp;
		this.basicSalary = 10000;
		this.status = "Active";	
		}
	}

	public void applyForLwp() {
		setStatus("InActive");
		setBasicSalary(0);

	}



	public Employee(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
		this.designation = "ASE";
		this.basicSalary = 10000;
		this.status = "Active";
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", designation=" + designation + ", yearsOfExp="
				+ yearsOfExp + ", basicSalary=" + basicSalary + ", status=" + status + "]";
	}
	
	
}

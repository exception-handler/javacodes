package ans7;

public class CollegeCourse {
	
	private String department;
	private int courseNumber;
	private int credits;
	private int fees;
	public CollegeCourse(String department, int courseNumber, int credits) {
		super();
		this.department = department;
		this.courseNumber = courseNumber;
		this.credits = credits;
		this.fees=120*credits;
	}
	
public CollegeCourse() {
		// TODO Auto-generated constructor stub
	}

public void display()
{
	System.out.println("department is:"+getDepartment());
	System.out.println("courseNumber is:"+getCourseNumber());
	System.out.println("credits are:"+getCredits());
	feesCalculate();
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public int getCourseNumber() {
	return courseNumber;
}

public void setCourseNumber(int courseNumber) {
	this.courseNumber = courseNumber;
}

public int getCredits() {
	return credits;
}

public void setCredits(int credits) {
	this.credits = credits;
}

public int getFees() {
	return fees;
}

public void setFees(int fees) {
	this.fees = fees;
}
public void feesCalculate()
{
	int fees;
	if(getDepartment().equalsIgnoreCase("BIO")||getDepartment().equalsIgnoreCase("CHM")||getDepartment().equalsIgnoreCase("CIS")||getDepartment().equalsIgnoreCase("PHY")){
	fees=getFees()+50;
	System.out.println("fees is:"+fees);
	}
	else
	{
		System.out.println("fees is:"+getFees());
	}
}

}//class end

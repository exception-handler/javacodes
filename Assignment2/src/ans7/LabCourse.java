package ans7;

public class LabCourse extends CollegeCourse {
//add 50 to course fees
	public LabCourse(String department, int courseNumber, int credits) {
		super(department, courseNumber, credits);
		// TODO Auto-generated constructor stub
	}

	public LabCourse() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		
		System.out.println("department is:"+getDepartment());
		System.out.println("courseNumber is:"+getCourseNumber());
		System.out.println("credits are:"+getCredits());
		feesCalculate();
	}
	
	

}

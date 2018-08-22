package Answer2;

public class Employee {

		int empID;
		String empName;
		String dob;
		public int getEmpID() {
			return empID;
		}
		public void setEmpID(int empID) {
			this.empID = empID;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public Employee(int empID, String empName, String i) {
			super();
			this.empID = empID;
			this.empName = empName;
			this.dob = i;
		}
		@Override
		public String toString() {
			return "Employee [empID=" + empID + ", empName=" + empName + ", dob=" + dob + "]";
		}
		
		
}

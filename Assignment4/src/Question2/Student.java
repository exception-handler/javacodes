package Question2;

public class Student {
	private int idNumber;
	private String firstName;
	private String lastName;
	private int noOfCreditHours;
	public Student(int idNumber, String firstName, String lastName, int noOfCreditHours) {
		super();
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.noOfCreditHours = noOfCreditHours;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNoOfCreditHours() {
		return noOfCreditHours;
	}
	public void setNoOfCreditHours(int noOfCreditHours) {
		this.noOfCreditHours = noOfCreditHours;
	}
	@Override
	public String toString() {
		return "Student [idNumber=" + idNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", noOfCreditHours=" + noOfCreditHours + "]";
	}
	
	

}

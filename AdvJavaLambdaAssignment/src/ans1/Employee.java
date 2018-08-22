package ans1;

public class Employee implements Addressable {
	
	String city;
	String state;
	
	
	public Employee(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return state;
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return city;
	}

}

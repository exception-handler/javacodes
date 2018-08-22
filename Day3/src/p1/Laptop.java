package p1;

public class Laptop extends Electronics {
	
	public Laptop(int current,String software) {
		super(current);
		this.software=software;
		// TODO Auto-generated constructor stub
	}   
	
	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	

	private String software;


public void doProgramming()
{
	System.out.println("programming on :" +software);
}


}

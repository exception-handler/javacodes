package ans1;

public class Manager implements Role {

	private String managerRoleName;
	private String managerResponsibility;
	
	public Manager(String managerRoleName, String managerResponsibility) {
		super();
		this.managerRoleName = managerRoleName;
		this.managerResponsibility = managerResponsibility;
	}

	

	public void setManagerRoleName(String managerRoleName) {
		this.managerRoleName = managerRoleName;
	}

	

	public void setManagerResponsibility(String managerResponsibility) {
		this.managerResponsibility = managerResponsibility;
	}

	@Override
	public String getRoleName() {
		// TODO Auto-generated method stub
		return managerRoleName;
	}

	@Override
	public String getResponsibility() {
		// TODO Auto-generated method stub
		return managerResponsibility;
	}

	
	
	

	

}

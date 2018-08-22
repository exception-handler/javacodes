package ans1;

public class Ceo implements Role {
	private String ceoRoleName;
	private String ceoResponsibility;

public Ceo(String ceoRoleName, String ceoResponsibility) {
		super();
		this.ceoRoleName = ceoRoleName;
		this.ceoResponsibility = ceoResponsibility;
	}

public String getCeoRoleName() {
		return ceoRoleName;
	}

	public void setCeoRoleName(String ceoRoleName) {
		this.ceoRoleName = ceoRoleName;
	}

	

	@Override
	public String getRoleName() {
		// TODO Auto-generated method stub
		return ceoRoleName;
	}

	@Override
	public String getResponsibility() {
		// TODO Auto-generated method stub
		return ceoResponsibility;
	}


}

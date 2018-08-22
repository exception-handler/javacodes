package p1;

public class Mobile extends Electronics{

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public Mobile(int current,String Contact) {
		super(current);
		this.Contact=Contact;
		// TODO Auto-generated constructor stub
	}

	private String Contact;


public void call()
{
	System.out.println("call to :" +Contact);
}


}
package p1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass m=new MainClass();
		Laptop l=new Laptop(10, "netbeans");
		m.printDetail(l);
		Mobile mo=new Mobile(2, "Rohit");
		m.printDetail(mo);
				
	}

	
	public void printDetail(Electronics e)
	
	   
	{
		electronics(e);
		
		if(e instanceof Mobile)
		{	
			Mobile m=(Mobile)e;
			//System.out.println("the contact is :"+m.getContact());
			m.call();
		}
		
		if(e instanceof Laptop)
		{
			Laptop l=(Laptop)e;
			//System.out.println("programming is done on:"+l.getSoftware());
			l.doProgramming();
		}
	}
	
	public void electronics(Electronics e)
	{
		System.out.println("the current is: "+e.getCurrent());
	}
}

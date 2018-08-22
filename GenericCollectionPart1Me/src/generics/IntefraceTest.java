package generics;

public class IntefraceTest {

	public static void main(String[] args) {
		
		Add a=new Add();
		JoinString js=new JoinString();
		a.getData(20,30);
		
		js.getData("Rohit", "Nain");
		String res=js.joinString();
		System.out.println("Concatinated String is "+res);
		System.out.println("sum is "+a.sum());

	}

}

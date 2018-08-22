package ans8;

import java.util.Scanner;

public class Female extends Child{

	public Female(String name) {
		super(name,"Female");
		this.setAge();
		this.display();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void setAge() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int age=Integer.parseInt(sc.nextLine());
		setAge(age);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Name is:"+getName());
		System.out.println("Gender is:"+getGender());
		System.out.println("Age is:"+getAge());
		
	}

}

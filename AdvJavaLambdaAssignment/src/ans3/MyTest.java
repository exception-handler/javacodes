package ans3;

public class MyTest {

	public static void main(String[] args) {
		
		MyInterface mi=new MyInterface() {
			
			@Override
			public void myTest() {
				System.out.println("Anonymous class");
				
			}
		};
mi.myTest();
MyInterface mi2=()->System.out.println("Lambda expression");
	mi2.myTest();
	}

}

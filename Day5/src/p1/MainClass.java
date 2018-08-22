package p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera[] cam=new Camera[5];
		Laptop[]  lapi=new Laptop[5];
		cam[0]=new Camera(4);
		cam[1]=new Camera(5);
		cam[2]=new Camera(6);
		cam[3]=new Camera(4);
		cam[4]=new Camera(9);
		
		lapi[0]=new Laptop(50000,"dell",cam[0]);
		lapi[1]=new Laptop(20000,"hcl",cam[1]);
		lapi[2]=new Laptop(30000,"hp",cam[2]);
		lapi[3]=new Laptop(25000,"toshiba",cam[3]);
		lapi[4]=new Laptop(40000,"acer",cam[4]);
		
		String path = "Laptop.txt";
		
		MainClass obj = new MainClass();
		try {
			obj.saveLaptop(lapi, path);
			obj.readLaptop(path);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main end

		
		public void saveLaptop(Laptop[] laptop,String path)throws Exception
		{
			FileOutputStream fos = new FileOutputStream(new File(path));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(laptop);

			System.out.println("Done ...");
			
		}
		
		
		public void readLaptop(String path)throws Exception
		{
			FileInputStream fis = new FileInputStream(new File(path));
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Laptop laptop[] = (Laptop[])ois.readObject();	
			
			//it return object class object so we type cast to convert it into laptop	
			for (Laptop laptop2 : laptop) {
				System.out.println(laptop2);
			}
			
			laptop[0].getCamera().getMegaPixel();
			
		}
		

}//class end

 

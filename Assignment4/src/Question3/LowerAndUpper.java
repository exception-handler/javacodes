package Question3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LowerAndUpper {
	static final File F_1 = new File("C:\\Users\\rohit.nain\\Desktop\\EclipseStart\\Assignment4\\LowerClassMan.txt");
	static String str="";
	static String str1="";
	static final File F_2 = new File("C:\\Users\\rohit.nain\\Desktop\\EclipseStart\\Assignment4\\UpperClassMan.txt");
	public static void main(String[] args) throws IOException {
	
		FileReader fr1=new FileReader(F_1);
		FileReader fr2=new FileReader(F_2);
		BufferedReader br1=new BufferedReader(fr1);
		BufferedReader br2=new BufferedReader(fr2);
		
		while((str=br1.readLine())!=null&&(str1=br2.readLine())!=null)
		{	System.out.println("Data of LowerClassMan");
			System.out.println(str);
			System.out.println("Data of UpperClassMan");
			System.out.println(str1);
		}


	}

}

package Question5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;

public class MainClass {
	static File f=new File("D:\\Demo\\Player.txt");

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		MainClass runner=new MainClass();
		runner.fileInfo(br, f);
		
	}
	
	public void fileInfo(BufferedReader br,File f) throws IOException
	{
		int count=0;
		String str="";
		while((str=br.readLine())!=null)
		{
			count++;
		}
		System.out.println("Total no of lines : "+count);
		System.out.println("File path is : "+f.getAbsolutePath());
		System.out.println("Total size of File : "+f.length()+"Bytes");
		System.out.println("Last modified Date : "+new Date(f.lastModified()));
	}

}

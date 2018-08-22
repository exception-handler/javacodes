package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import utility.Connector;

public class MainClass {
	static List<Employee> empList=new ArrayList<>();
	static{
		File file=new File("C:\\Users\\rohit.nain\\Desktop\\EclipseStart\\TestPreparation\\Data");
		FileReader fr=null;
		int count=0;
		try {
			fr = new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String string="";
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			
			while((string=br.readLine())!=null)
			{	
				
				String arr[]=string.split(",");
				System.out.println(arr[2]);
				Date d1=sdf.parse(arr[2]);
				System.out.println(d1);
				java.sql.Date d2=new java.sql.Date(d1.getTime());
				System.out.println(d2);
				empList.add(new Employee(Integer.parseInt(arr[0]),arr[1],d2));
				String query="insert into myemployees values(?,?,?)";
				Connection con=Connector.connection();
				PreparedStatement ps=con.prepareStatement(query);
				ps.setInt(1, Integer.parseInt(arr[0]));
				ps.setString(2, arr[1]);
				ps.setDate(3, d2);
				ps.executeQuery();
				count++;
				
			}
			
			if(count>0)
				System.out.println("Data inserted.");
			if(count==0)
				System.out.println();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
	
}
	
	public static void main(String[] args) {
		/*
			for (Employee emp : empList) {
			System.out.println(emp);
			}*/
	}//main end

}

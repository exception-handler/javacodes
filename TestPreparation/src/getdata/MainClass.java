package getdata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.Employee;
import utility.Connector;

public class MainClass {
	static List<Employee> empList=new ArrayList<>();
	public static void main(String[] args) throws SQLException, IOException {
		String query="select * from myemployees";
		File file=new File("C:\\Users\\rohit.nain\\Desktop\\EclipseStart\\TestPreparation\\Data");
		Connection con=Connector.connection();
		PreparedStatement ps=con.prepareStatement(query);
		ResultSet rs=ps.executeQuery();

		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		while(rs.next())
		{
			empList.add(new Employee(rs.getInt(1),rs.getString(2),rs.getDate(3)));
			bw.write(rs.getInt(1)+","+rs.getString(2)+","+rs.getDate(3)+"\n");
		
		}
		bw.close();
		fw.close();
		System.out.println("Done");
		
		
	}

}

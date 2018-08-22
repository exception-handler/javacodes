package ans1;

import java.sql.*;

import utility.Connector;

public class MainClass {
	public static void main(String args[]) {
		try {
			String q = "select count(id) from jdbc";
			Connector c=new Connector();
			Connection con=c.connection();
			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery(q);
		
			
			while (rs.next()) {
				System.out.println("No of records in jdbbc table are :"+rs.getInt(1));
			}
			//int result=stmt.executeUpdate("delete from jdbc where id=103");  
			//System.out.println(result+" records affected"); 
			// step5 close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
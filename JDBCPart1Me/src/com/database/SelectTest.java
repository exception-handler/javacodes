package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
			Connection con=DriverManager.getConnection//connection build with database
					("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		
			Statement statement=con.createStatement();//execute query
			ResultSet res=statement.executeQuery("Select * from Employee_info");//result set take data
			//executeQuery give result set
			while(res.next())
			{
				System.out.println("Eid "+res.getInt(1)+" Name "+res.getString(2)
				+" Dept "+res.getString(3)+" Salary "+res.getLong(4));
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}

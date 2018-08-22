package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.utility.ConnectionProvider;

public class InsertTest {

	public static void main(String[] args) throws SQLException {
	
		Connection con;
		PreparedStatement ps;
		con=ConnectionProvider.getCon();
		
		ps=con.prepareStatement("insert into Employee_Info values(?,?,?,?)");
		ps.setInt(1, 105);
		ps.setString(2, "Ajay");
		ps.setString(3, "Insurance");
		ps.setFloat(4, 5567.90f);
		int res=ps.executeUpdate();//will return no of rows in integer
		if(res>0)
		{
			System.out.println("Record Inserted");
		}
		else
		{
			System.out.println("Unable to insert the record");
		}
	}

}

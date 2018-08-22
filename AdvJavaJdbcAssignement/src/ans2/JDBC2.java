package ans2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import utility.Connector;

public class JDBC2 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		JDBC2 jdbc=new JDBC2();
		System.out.println("enter id to be searched: ");
		int id=Integer.parseInt(sc.nextLine());
		jdbc.search(id);
	}

	public void search(int id)
	{
		String query="select * from emp2 where id="+id;
		Connection con=Connector.connection();
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			if(rs.next())
			{
				System.out.println("id is: "+rs.getInt(1)+" name is :"+rs.getString(2));
			}
			else
			{
				System.out.println("rescord dosent exist!");
			}
		} catch (Exception e) {
		
		}
	}
}

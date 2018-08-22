package ans5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import utility.Connector;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		Connection con=Connector.connection();
		PreparedStatement ps=con.prepareStatement("select * from product1");
		
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.print(rsmd.getColumnTypeName(1)+"  ");
		System.out.print(rsmd.getColumnTypeName(2)+"  ");
		System.out.print(rsmd.getColumnTypeName(3)+"  ");
		System.out.println(rsmd.getColumnTypeName(4));
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"    ");
			System.out.print(rs.getString(2)+"     ");
			System.out.print(rs.getFloat(3)+"  ");
			System.out.println(rs.getDate(4));
		}
	}

}
